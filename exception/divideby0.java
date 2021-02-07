package exception;

public class divideby0 {

	public static void main(String[] args) {
		int a = 15; 
		int b = 0;
		int c;
		try { 
			System.out.println("c" +(a / b));
		} 
		catch (ArithmeticException e) { 
			System.out.println("Divided by zero cannot possible"); 
		} 

	}

}
