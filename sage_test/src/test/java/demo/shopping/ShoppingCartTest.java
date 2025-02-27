package demo.shopping;

import static org.junit.Assert.*;

import org.junit.Test;

import demo.shoping.ShoppingCart;

public class ShoppingCartTest {

    private ShoppingCart createTestSubject() {
        return new ShoppingCart();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddOrUpdateCartNullInput() {
        createTestSubject().addOrUpdateCart(null, 10, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddOrUpdateCartNullInput2() {
        createTestSubject().addOrUpdateCart(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddOrUpdateCartEmptyInput() {
        createTestSubject().addOrUpdateCart("   ", 10, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddOrUpdateCartInvalidPrice() {
        createTestSubject().addOrUpdateCart("Hovis", -50, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddOrUpdateCartInvalidQuantity() {
        createTestSubject().addOrUpdateCart("Hovis", 50, 0);

    }

    @Test()
    public void testAddCart() {
        ShoppingCart subject = createTestSubject();
        subject.addOrUpdateCart("Hovis", 39.99f, 1);
        assertEquals(1, subject.getItems().size());
    }

    @Test()
    public void testAndAndUpdateCart() {
        ShoppingCart subject = createTestSubject();
        subject.addOrUpdateCart("Hovis", 39.99f, 1);
        subject.addOrUpdateCart("Hovis", 39.99f, 4);

        assertEquals(5, subject.getItems().get(0).quantity());
    }

    @Test()
    public void testAndAndUpdateCart2() {
        ShoppingCart subject = createTestSubject();
        subject.addOrUpdateCart("Hovis", 39.99f, 1);
        subject.addOrUpdateCart("Fairy", 99.99f, 1);
        subject.addOrUpdateCart("Hovis", 39.99f, 4);

        assertEquals(5,
                subject.getItems().stream().filter(item -> item.name().equals("Hovis")).findFirst().get().quantity());
    }

    @Test()
    public void testaddOrUpdateStep1() {
        ShoppingCart subject = createTestSubject();
        subject.addOrUpdateCart("Hovis", 39.99f, 5);
        assertEquals(199.95,subject.getTotal(),0);
    }

    @Test()
    public void testaddOrUpdateStep2() {
        ShoppingCart subject = createTestSubject();
        subject.addOrUpdateCart("Hovis", 39.99f, 5);
        subject.addOrUpdateCart("Hovis", 39.99f, 3);
        assertEquals(319.92,subject.getTotal(),0);
    }

    @Test()
    public void testaddOrUpdateStep3() {
        ShoppingCart subject = createTestSubject();
        subject.addOrUpdateCart("Hovis", 39.99f, 1);
        subject.addOrUpdateCart("Fairy", 99.99f, 1);
        subject.addOrUpdateCart("Hovis", 39.99f, 1);
        subject.addOrUpdateCart("Fairy", 99.99f, 1);
        subject.calcGrandTotalWithTax();
        assertEquals(35,subject.getTotalTax(),0);
        assertEquals(314.96,subject.getGrandTotal(),0);
    }

    

}
