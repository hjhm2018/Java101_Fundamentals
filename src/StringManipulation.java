import java.util.Locale;

/**
 * @author Henry
 * 
 * 
 */

public class StringManipulation {

	static String string1 = "Hello Peter. ";
	static String string2 = "hello Peter";

	static StringBuffer reversedString = new StringBuffer(string2).reverse();

	static String string3 = string1.concat(string2);
	static int stringIndex = string3.lastIndexOf("Peter");
	static int stringIndexOf = string3.indexOf("Peter");

	/**
	 * Method that compares strings
	 */

	static void compareStrings() {
		System.out.println(string1.compareTo(string2));
	}

	/**
	 * Method that that shows the last index of a string
	 */

	static void lastIndex() {
		if (stringIndex == -1) {
			System.out.println("Peter is not there");
		} else {
			System.out.println("The last index of Peter is " + stringIndex);
		}
	}

	/**
	 * Method that removes characters from strings
	 */

	static void removeCharacter() {
		System.out.println(string3.substring(6));
	}

	/**
	 * Method that reverses strings
	 */

	static void reverseString() {
		System.out.println("This is a reversed string: " + reversedString);
	}

	/**
	 * Method that shows the index of strings
	 */

	static void indexOfString() {
		System.out.println("The index of Peter is: " + stringIndexOf);
	}

	/**
	 * Method that splits strings into substrings
	 */

	static void splitString() {
		String longString = "Today-is-Wednesday";

		String[] tempArray;

		String delimiter = "-";

		tempArray = longString.split(delimiter);

		for (int i = 0; i < tempArray.length; i++) {
			System.out.println(tempArray[i]);
		}

	}

	static String lowerCaseString = "abcdefghijklmnopqrstuvwxyz";

	/**
	 * Method that converts strings to uppercase
	 */

	static public void stringToUpperCase(String aString) {
		System.out.println(aString.toUpperCase());
	}

	static String upperCaseString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	/**
	 * Method that converts strings to lowercase
	 */

	static public void stringToLowerCase(String bString) {
		System.out.println(bString.toLowerCase());
	}

	static String first_string = "I usually travel on Mondays";
	static String second_string = "I hate Mondays";

	/**
	 * Method that checks if parts of strings match
	 */

	static public void stringMatch(String stringA, String stringB) {

		boolean match = stringA.regionMatches(20, stringB, 7, 7);
		System.out.println(match);
	}

	/**
	 * Method that checks strings performance
	 */

	static public void stringPerformance() {
		long startTime = System.currentTimeMillis();

		for (int i = 0; i < 5000000; i++) {
			String stringOne = "Hello";
			String stringTwo = "Hello";
		}

		long endTime = System.currentTimeMillis();

		System.out.println(
				"The time that takes the system to complete the task is : " + (endTime - startTime) + " miliseconds");
	}

	/**
	 * Method that optimizes strings creation performance
	 */

	static void stringOptimize() {
		String array[] = new String[50000];
		for (int i = 0; i < 50000; i++) {
			array[i] = "s" + i;
		}
		long startTime0 = System.currentTimeMillis();

		for (int i = 0; i < 50000; i++) {
			array[i] = "bye";
		}
		long endTime0 = System.currentTimeMillis();
		System.out.println("Creation time of String literals : " + (endTime0 - startTime0) + " ms");
		long startTime1 = System.currentTimeMillis();

		for (int i = 0; i < 50000; i++) {
			array[i] = new String("bye");
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("Creation time of String objects using 'new' key word : " + (endTime1 - startTime1) + " ms");
		long startTime2 = System.currentTimeMillis();

		for (int i = 0; i < 50000; i++) {
			array[i] = new String("hello");
			array[i] = array[i].intern();
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println("Creation time of String objects using intern(): " + (endTime2 - startTime2) + " ms");

	}

	/**
	 * Method that shows string formats at different world location
	 */

	static void stringFormat() {

		float aFloat = 89848.89f;

		System.out.format("%f%n", aFloat);
		System.out.format(Locale.ITALY, "%-10.4f%n%n", aFloat);
	}

	/**
	 * Method that concatenates strings
	 */

	static void concatenateStrings() {
		StringBuffer majorString = new StringBuffer();

		majorString.append("This is ");
		majorString.append("another way to ");
		majorString.append("concatenate strings.");

		System.out.println(majorString);
	}

	/**
	 * Method that gets strings unicode
	 */

	static public void getStringUnicode() {
		String exampleString = "This is a test string";

		System.out.println("Unicode at position 7 in the string is = " + exampleString.codePointBefore(7));
	}

	/**
	 * Method that buffers strings
	 */

	static void stringBuffer() {
		StringBuffer stringBuffered = new StringBuffer("Hello ");
		stringBuffered.append("world");
		stringBuffered.insert(0, "StringBuffer in used: ");
		System.out.print(stringBuffered);
	}

	public static void main(String[] args) {

		compareStrings();
		lastIndex();
		removeCharacter();
		reverseString();
		indexOfString();
		splitString();
		stringToUpperCase(lowerCaseString);
		stringToLowerCase(upperCaseString);
		stringMatch(first_string, second_string);
		stringPerformance();
		stringOptimize();
		stringFormat();
		concatenateStrings();
		getStringUnicode();
		stringBuffer();

	}

}
