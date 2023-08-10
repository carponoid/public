package test.pkb;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.extern.java.Log;
import test.pkb.exception.TextNotFoundException;

/**
 * Utility class to perform search operation on given text
 */
@Log
public class TextSearch {

    private Predicate<String> isEvenLength = word -> {
        word = word.trim();
        return word.length() % 2 == 0;
    };

    private Predicate<String> isAlpha = word -> {
        long noOfAlphaChars = word.chars().filter(Character::isAlphabetic).count();
        return noOfAlphaChars == word.length();
    };

    /**
     * This method performs search operation on the given text to find the longest
     * even number. This method assumes the words in supplied text are delimtted by
     * single space
     * 
     * @param test                of type @String - the text in which search should
     *                            be performed
     * @param includeSpecialChars of type @boolean - set to true to include words
     *                            with special chars (ex. hyphen, comma, numbers
     *                            etc.. any char that is not an alphabet) or set to
     *                            false to exclude words with special chars from
     *                            search
     * @return @String - the longest even word from the given search text, if no
     *         word can be found TextNotFoundException will be throws
     * @throws TextNotFoundException
     *                               Example - if all words in the given text
     *                               contains speacial chars and
     *                               includeSpecialChars set to false and
     *                               TextNotFoundException will be thrown
     */
    public String findLongestEvenWord(String text, boolean includeSpecialChars) throws TextNotFoundException {
        log.info("findLonges >> ");
        String result = null;
        if (text == null) {
            log.severe("Invlaid Input >> " + text);
            throw new TextNotFoundException("Null or Empty Input");
        }
        Map<Integer, List<String>> evenWords = null;

        if (includeSpecialChars) {
            evenWords = Stream.of(text.split(" ")).filter(isEvenLength)
                    .collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
        } else {
            evenWords = Stream.of(text.split(" ")).filter(isEvenLength).filter(isAlpha)
                    .collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
        }

        if (evenWords.isEmpty()) {
            log.warning("No even words found for the given input");
            throw new TextNotFoundException("No even words found");
        }
        result = evenWords.entrySet().stream().max(Map.Entry.comparingByKey()).get().getValue().get(0);
        log.info("findLonges << " + result);
        return result;
    }

}
