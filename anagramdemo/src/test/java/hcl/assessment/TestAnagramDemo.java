package hcl.assessment;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;

public class TestAnagramDemo {

	private AnagramDemo createTestSubject(String input,ByteArrayOutputStream output) {
		return new AnagramDemo(new ByteArrayInputStream(input.getBytes()),new PrintStream(output));
	}
	
	private String testAnagramDemo(String inputString) {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		createTestSubject(inputString,outputStream).startAnagramDemo();;
		return outputStream.toString();
	}

	@Test
	public void testStartAnagramDemoValidResult() throws Exception {
		String output = testAnagramDemo("tca");
		assertTrue(output.contains("act") && output.contains("cat"),"Actual output :\t"+output);
	}
	
	@Test
	public void testStartAnagramDemoNoResult() throws Exception {
		String output = testAnagramDemo("xvd");
		assertTrue(output.contains("No anagram found for the given input"),"Actual output :\t"+output);
	}
	
	@Test
	public void testStartAnagramDemoInvalidInput() throws Exception {
		String output = testAnagramDemo("   ");
		assertTrue(output.contains("Invalid input"),"Actual output :\t"+output);
	}
	
	@Test
	public void testStartAnagramDemoNumericInput() throws Exception {
		String output = testAnagramDemo("123");
		assertTrue(output.contains("No anagram found for the given input"),"Actual output :\t"+output);
	}
	
	@Test
	public void testStartAnagramDemoShortInput() throws Exception {
		String output = testAnagramDemo("AB");
		assertTrue(output.contains("Invalid input"),"Actual output :\t"+output);
	}
	
	@Test
	public void testStartAnagramDemoASCIIInput() throws Exception {
		String output = testAnagramDemo("èç¨§");
		assertTrue(output.contains("No anagram found for the given input"),"Actual output :\t"+output);
	}

	/*
	 * @Test public void testStartAnagramDemo() throws Exception { AnagramDemo
	 * testSubject;
	 * 
	 * // default test testSubject = createTestSubject();
	 * testSubject.startAnagramDemo();
	 * 
	 * Assert.fail(); }
	 */
}