package ExceptionHandling;

public class DividedByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		try {
			a=0;
			b=10;
			c=b/a;
			System.out.println("This line will not be executed...");
		}
		catch(ArithmeticException e) {
			System.out.println("Divided by Zero");
		}
		System.out.println("It's a Exception Handling.");
	}

}
