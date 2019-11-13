/** 
 * @author Henry
 * 
 * */


public class ConsoleApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length > 0) {
			System.out.println(args.length);
		} else {
			System.out.println("Hello World");
		}
		
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		// Create a String and display it
		
		String aString = "I'm a string";
		
		System.out.println(aString);
		
		// Create an integer and display it
		
		int anInteger = 10;
		
		System.out.println(anInteger);
		
		// Create a variable without a value and assign to it later, and display
		
		String bString;
		
		bString = "Now I am initialized";
		
		System.out.println(bString);
		
		// Overwrite a variable and display it
		
		bString = "Now I have a different text";
		
		System.out.println(bString);
		
		// Create a final variable and display it
		
		final int finalInteger = 20;
		
		System.out.println(finalInteger);
		
		// Add a variable to another and display it
		
		String cString = aString + ". " + bString;
		
		System.out.println(cString);
		
		// Copy a variable and display it
		
		String dString = aString;
		
		System.out.println(dString);
		
		// Create a byte type variable and display it - -128 to 127
		
		byte aByte = 89;
		
		System.out.println(aByte);
		
		// Create a short type variable and display it - 32,768 to 32,767
		
		short aShort = 30000;
		
		System.out.println(aShort);
		
		// Create an integer type variable and display it - -2,147,483,648 to 2,147,483,647
		
		int integerExample = 989583;
		
		System.out.println(integerExample);
		
		
		// Create a long type variable and display it - -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		
		long aLong = 4979344903470934743L;
		
		System.out.println(aLong);
		
		// Create a float type variable and display it - 6 to 7 decimal digits
		
		float aFloat = 8.75f;
		
		System.out.println(aFloat);
		
		// Create a double type variable and display it - up to 15 decimal digits
		
		double aDouble = 7.89d;
		
		System.out.println(aDouble);
		
		// Create a boolean type variable and display it
		
		boolean aBoolean = true;
		
		System.out.println(aBoolean);
		
		// Create a char type variable and display it - ASCII table
		
		char aChar = 67;
		
		System.out.println(aChar);
		// Compile using javac ConsoleApplication.java at the console
		
		//java ConsoleApplication ARG1 ARG2 ARG3 => adding arguments to run the file

	}

}
