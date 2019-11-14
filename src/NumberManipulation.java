
public class NumberManipulation {
	
	static int A = 10;
	static int B = 20;
	
	static int SUM() {
		return A + B;
	}
	
	static int SUB() {
		return A - B;
	}
	
	static int MUL() {
		return A * B;
	}
	
	static int DIV() {
		return A / B;
	}
	
	static int MODULUS() {
		return A % B;
	}
	
	static boolean BOOL() {
		if(B > A) {
		return true;
		}
		return false;
	}
	
	static void bytesIncrement() {
		for(int i = 0; i <= Byte.MAX_VALUE; i++) {
			System.out.println(i);
		}
	}
	
	static void integerMaxValue() {
		for(int i = Integer.MAX_VALUE; i > 0 ; i--) {
			System.out.println(i);
		}
	}






	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(BOOL());
		
		bytesIncrement();
		
		integerMaxValue();

	}

}
