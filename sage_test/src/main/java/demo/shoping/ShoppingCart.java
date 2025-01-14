package demo.shoping;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

import org.apache.commons.lang3.StringUtils;

import lombok.extern.java.Log;

@Log
public class ShoppingCart {

    private Map<String, Item> items;
    double total;
    double totalTax;
    double grandTotal;

    public record Item(String name, float price, int quantity) {
        public Item withAdditionalQuantity(int additionalQuantity) {
            return new Item(name(), price(), quantity()+additionalQuantity);
        }
    }

    private float fixedTaxRate = 12.5f;
    private static DecimalFormat decimalFormat;

    static {
        decimalFormat = new DecimalFormat("0.00");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
    }

    public ShoppingCart() {
        items = new HashMap<>();
    }

    /**
     * Retrieves all items currently in the shopping cart.
     * 
     * @return A List of Item objects representing all items in the cart.
     *         The list is created from the values of the internal items map.
     *         If the cart is empty, an empty list is returned.
     */
    public List<Item> getItems() {
        log.log(Level.FINE, "Getting items from shopping cart");
        return items.values().stream().toList();
    }

    /**
     * Validates an item to ensure it meets the required criteria.
     * 
     * @param item The item to be validated. It should not be null, have a non-empty
     *             name, and a positive quantity.
     * @throws IllegalArgumentException If the item is null, has an empty name, or
     *                                  has a quantity less than or equal to zero.
     */
    public void validateItem(Item item) {
        log.log(Level.FINE, "Validating item");
        if (item == null || !StringUtils.isNotBlank(item.name()) || item.price < 0 || item.quantity <= 0) {
            log.log(Level.SEVERE, "Invalid item  \n" + item);
            throw new IllegalArgumentException("Invalid item");
        }
    }

    /**
     * Updates the shopping cart with the given item. If the item already exists in
     * the cart,
     * its quantity is updated. Otherwise, the new item is added to the cart.
     *
     * @param item The item to be added or updated in the cart. Must not be null and
     *             must pass validation.
     * @throws IllegalArgumentException If the item is invalid (null, empty name, or
     *                                  non-positive quantity).
     */
    public void addOrUpdateCart(Item item) {
        validateItem(item);
        if (items.containsKey(item.name().trim())) {
            log.log(Level.FINE, "Product already exisits, updating cart" + item.name());
            Item existingItem = items.get(item.name());
            items.remove(item.name());
            item = existingItem.withAdditionalQuantity(item.quantity());
        } else {
            log.log(Level.FINE, "Adding new product to cart" + item.name());
        }
        items.put(item.name().trim(), item);
        total = items.values().stream().mapToDouble(tItem -> tItem.price() * tItem.quantity()).sum();
        total = Double.parseDouble(decimalFormat.format(total));
    }

    public void calcGrandTotalWithTax() {
        totalTax = Math.ceil((total / 100) * fixedTaxRate);
        grandTotal = Double.parseDouble(decimalFormat.format(total + totalTax));
        log.log(Level.FINE, "Total Price : " + total + "\nTotal Tax : " + totalTax + "\nGrand Total : " + grandTotal);
    }


    public void addOrUpdateCart(String name, float price, int quantity) {
        log.log(Level.FINE, "Adding or updating cart with product" + name);
        addOrUpdateCart(new Item(name, price, quantity));
    }
    
    public double getTotalTax() {
        return Math.ceil(totalTax);
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public double getTotal() {
        return total;
    }
    
}
