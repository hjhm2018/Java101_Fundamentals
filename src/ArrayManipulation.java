import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java.util.List;

public class ArrayManipulation {

	/**
	 * Method to sort array and search an element inside of it
	 */

	static public void sortArray() {
		int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		Arrays.sort(array);
		printArray("Sorted array:", array);
		int index = Arrays.binarySearch(array, -7);
		System.out.println("Found -7 @ " + index);
	}

	static public void printArray(String message, int array[]) {
		System.out.println(message);

		for (int i = 0; i < array.length; i++) {
			if (i != 0) {
				System.out.print(", ");
			}
			System.out.print(array[i]);
		}
		System.out.println();
	}

	/**
	 * Method to determine upper bound of a 2D Array
	 * 
	 */

	static public void upperBound2DArray() {
		String[][] array2D = new String[2][5];
		System.out.println("Dimension 1: " + array2D.length);
		System.out.println("Dimension 2: " + array2D[0].length);
	}

	/**
	 * Method to reverse an Array
	 * 
	 */

	static public void reverseArray() {
		ArrayList arrayList = new ArrayList();
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");
		arrayList.add("4");
		arrayList.add("5");
		System.out.println("Original Array: " + arrayList);
		Collections.reverse(arrayList);
		System.out.println("Reversed Array: " + arrayList);
	}

	/**
	 * Method to display an Array of strings in the console
	 * 
	 */

	static public void displayArray() {
		String[] greeting = new String[3];
		greeting[0] = "I'm number 1.";
		greeting[1] = "Number 2, here!";
		greeting[2] = "Don't forget number 3!.";

		for (int i = 0; i < greeting.length; i++) {
			System.out.println(greeting[i]);
		}
	}

	/**
	 * Method to search the min and max value of an Array
	 * 
	 */

	static public void displayMinAndMax() {
		Integer[] numbersArray = { 30, 40, 75, 15, 54, 69, 25 };
		int minValue = (int) Collections.min(Arrays.asList(numbersArray));
		int maxValue = (int) Collections.max(Arrays.asList(numbersArray));

		System.out.println("Min number: " + minValue);
		System.out.println("Max number: " + maxValue);
	}

	/**
	 * Method to merge Arrays
	 * 
	 */

	static public void arrayMerge() {
		String a[] = { "Monday", "Tuesday", "Wednesday", "Thursday" };
		String b[] = { "Friday", "Saturday", "Sunday" };
		List list = new ArrayList(Arrays.asList(a));
		list.addAll(Arrays.asList(b));
		Object[] c = list.toArray();
		System.out.println(Arrays.toString(c));
	}

	/**
	 * Method to initialize an Array
	 * 
	 */

	static public void initializeArray() {
		int array[] = new int[7];
		Arrays.fill(array, 200);

		for (int i = 0, n = array.length; i < n; i++) {
			System.out.println(array[i]);
		}
		System.out.println();
		Arrays.fill(array, 3, 6, 50);

		for (int i = 0, n = array.length; i < n; i++) {
			System.out.println(array[i]);
		}
	}

	/**
	 * Method to extend an Array
	 * 
	 */

	static public void extendArray() {
		String[] names = new String[] { "1", "2", "3" };
		String[] extended = new String[5];
		extended[3] = "4";
		extended[4] = "5";
		System.arraycopy(names, 0, extended, 0, names.length);

		for (String str : extended) {
			System.out.println(str);
		}
	}

	/**
	 * Method to remove an element of an Array
	 * 
	 */

	static public void removeElement() {
		ArrayList objArray = new ArrayList();
		objArray.clear();
		objArray.add(0, "Element 0");
		objArray.add(1, "Element 1");
		objArray.add(2, "Element 2");
		System.out.println("Original Array: " + objArray);
		objArray.remove(1);
		objArray.remove("Element 0");
		System.out.println("Array after removing the elements: " + objArray);
	}

	/**
	 * Method to remove an Array from another array
	 * 
	 */

	static public void removeArray() {
		ArrayList objArray = new ArrayList();
		ArrayList objArray2 = new ArrayList();
		objArray2.add(0, "One");
		objArray2.add(1, "Two");
		objArray2.add(2, "Three");
		objArray2.add(3, "Four");
		objArray.add(0, "One 1");
		objArray.add(1, "Two 2");
		objArray.add(2, "Three 3");
		System.out.println("Array elements of array1" + objArray);
		System.out.println("Array elements of array2" + objArray2);
		objArray.removeAll(objArray2);
		System.out.println("Array1 after removing array2 from array1" + objArray);
	}

	/**
	 * Method to find common elements within Arrays
	 * 
	 */

	static public void findElementsArray() {
		ArrayList objArray = new ArrayList();
		ArrayList objArray2 = new ArrayList();
		objArray2.add(0, "One");
		objArray2.add(1, "Two");
		objArray2.add(2, "Three");
		objArray2.add(3, "Four");
		objArray.add(0, "One");
		objArray.add(1, "Two");
		objArray.add(2, "Three");
		System.out.println("Array elements of array1: " + objArray);
		System.out.println("Array elements of array2: " + objArray2);
		objArray.retainAll(objArray2);
		System.out.println("Array1 after retaining common elements of array2 and array1: " + objArray);
	}

	/**
	 * Method to find objects within Arrays
	 * 
	 */

	static public void findObjectsArray() {
		ArrayList objArray = new ArrayList();
		ArrayList objArray2 = new ArrayList();
		objArray2.add(0, "One");
		objArray2.add(1, "Two");
		objArray2.add(2, "Three");
		objArray2.add(3, "Four");
		objArray.add(0, "One");
		objArray.add(1, "Two");
		System.out.println("Array elements of array1: " + objArray);
		System.out.println("Array elements of array2: " + objArray2);
		System.out.println("Does Array 1 contain String 'One'? " + objArray.contains("One"));
		System.out.println("Does Array 2 contain Array1? " + objArray2.contains(objArray));
	}

	/**
	 * Method to compare Arrays
	 * 
	 */

	static public void compareArrays() {
		int[] array1 = { 1, 2, 3, 4, 5, 6 };
		int[] array2 = { 1, 2, 3, 4, 5, 6 };
		int[] array3 = { 1, 2, 3, 4 };
		System.out.println("Is array 1 equal to array 2? " + Arrays.equals(array1, array2));
		System.out.println("Is array 1 equal to array 3? " + Arrays.equals(array1, array3));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sortArray();
		upperBound2DArray();
		reverseArray();
		displayArray();
		displayMinAndMax();
		arrayMerge();
		initializeArray();
		extendArray();
		removeElement();
		removeArray();
		findElementsArray();
		findObjectsArray();
		compareArrays();

	}

}
