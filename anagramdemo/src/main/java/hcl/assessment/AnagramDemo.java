package hcl.assessment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * Simple class to find anagrams from the dictionary for the given word.
 * 
 * This class loads the dictionary into memory and pre-process it for faster
 * search & retrieval.
 * 
 */
public class AnagramDemo {

	private InputStream input;
	private PrintStream output;
	
	public AnagramDemo(InputStream inputStream, PrintStream outputStream) {
		this.input = inputStream;
		this.output = outputStream;
	}

	public AnagramDemo() {
		this.input = System.in;
		this.output = System.out; // NOSONAR
	}

	/*
	 * The idea here is to use a simple static member to hold the values from text
	 * file for easy in-memory operations rather than reading it from the source
	 * every time. Since this is very small sample, a static member is enough to
	 * hold the values in memory, for more scalable needs would have used some other
	 * caching mechanism
	 */
	private static Map<String, List<String>> dictionary;

	static {
		/*
		 * each world will be converted into a key for easy retrieval, key might already
		 * exists in which case the word will be added to the list, this will also help
		 * anagrams with repetitive chars
		 */
		dictionary = new HashMap<>();
		try (InputStream dictionaryResourceStream = AnagramDemo.class.getClassLoader().getResourceAsStream("words.txt");
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(dictionaryResourceStream, StandardCharsets.UTF_8))) {
			reader.lines().forEach(word -> {
				String wordTrimmed = word.trim();
				if (wordTrimmed.length() > 0) {
					addWordToDictionary(wordTrimmed);
				}
			});
		} catch (IOException exception) {
			System.err.println(exception.getMessage()); // NOSONARR, Just so errors/exceptions are handled.
		}

	}

	/**
	 * Helper method used by static block to add the given word into the static
	 * dictionary.
	 * 
	 * @param word of type @String
	 */
	private static void addWordToDictionary(String word) {
		/*
		 * A simple indexing mechanism to group matching anagrams and store it against
		 * unique key, this technique is faster but only viable for lower loads, for
		 * higher loads would ideally use a database with more complex indexing
		 * techniques.
		 */
		char[] dictionaryKeyChars = word.toLowerCase().toCharArray();
		Arrays.sort(dictionaryKeyChars);
		String dictionaryKey = new String(dictionaryKeyChars);
		// If key already exists, word will be appending to the existing list
		List<String> listofWords = dictionary.get(dictionaryKey);
		if (listofWords == null) {
			listofWords = new ArrayList<>();
		}
		listofWords.add(word);
		Collections.sort(listofWords, String.CASE_INSENSITIVE_ORDER);
		dictionary.put(dictionaryKey, listofWords);
	}

	/**
	 * Main executor to kick start anagram demo.
	 * 
	 */
	public void startAnagramDemo() {
		try (Scanner userIOScanner = new Scanner(this.input)) {
			this.output.println("Enter the word/input/string");
			String inputString = userIOScanner.nextLine();
			if (inputString.trim().length() < 3) {
				this.output.println("Invalid input");
				return;
			}
			char[] inputKeyArr = inputString.toLowerCase().toCharArray();
			Arrays.sort(inputKeyArr);
			String inputKey = new String(inputKeyArr);
			if (dictionary.containsKey(inputKey)) {
				this.output.println("Anagrams found are");
				dictionary.get(inputKey).forEach(this.output::println);
			} else {
				this.output.println("No anagram found for the given input");
			}
		}
	}
}
