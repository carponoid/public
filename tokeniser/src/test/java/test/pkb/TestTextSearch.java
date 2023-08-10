package test.pkb;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import lombok.extern.java.Log;
import test.pkb.exception.TextNotFoundException;

/**
 * Unit test cases for TextSearch
 */
@Log
@TestInstance(Lifecycle.PER_CLASS)
public class TestTextSearch {

    TextSearch testSearch;
    Properties properties;

    @BeforeAll
    public void init() throws IOException {
        testSearch = new TextSearch();
        properties = new Properties();
        InputStream ins = TestTextSearch.class.getResourceAsStream("../../testdata.properties");
        properties.load(ins);
    }

    @Test
    public void testfindLongestEvenWordSuccess() {
        String input = properties.getProperty("testfindLongestEvenWordSuccess");
        String result = null;
        try {
            result = testSearch.findLongestEvenWord(input, false);
        } catch (TextNotFoundException e) {
            log.severe(e.getMessage());
        }
        Assertions.assertEquals("Sample", result);
    }

    @Test
    public void testfindLongestEvenWordFailure() {
        expectException(properties.getProperty("testfindLongestEvenWordFailure"));
    }

    @Test
    public void testfindLongestEvenWordNoSpeacialCharsSuccess() {
        String input = properties.getProperty("testfindLongestEvenWordNoSpeacialCharsSuccess");
        String result = null;
        try {
            result = testSearch.findLongestEvenWord(input, false);
        } catch (TextNotFoundException e) {
            log.severe(e.getMessage());
        }
        assertEquals("Anotherr", result);
    }

    @Test
    public void testfindLongestEvenWordNoSpecialCharsFailure() {
        expectException(properties.getProperty("testfindLongestEvenWordNoSpecialCharsFailure"));
    }

    @Test
    public void testfindLongestEvenWordWithSpecialCharsSuccess() {
        String input = properties.getProperty("testfindLongestEvenWordWithSpecialCharsSuccess");
        String result = null;
        try {
            result = testSearch.findLongestEvenWord(input, true);
        } catch (TextNotFoundException e) {
            log.severe(e.getMessage());
        }
        assertEquals("nosucces*s", result);
    }

    @Test
    public void testfindLongestEvenWordWithSpecialCharsFailure() {
        expectException(properties.getProperty("testfindLongestEvenWordWithSpecialCharsFailure"));
    }

    @Test
    public void testfindLongestEvenWordEmptyInput() {
        expectException(properties.getProperty("testfindLongestEvenWordEmptyInput"));
    }

    private void expectException(String input) {
        Assertions.assertThrows(TextNotFoundException.class, () -> {
            testSearch.findLongestEvenWord(input, false);
        });
    }
}
