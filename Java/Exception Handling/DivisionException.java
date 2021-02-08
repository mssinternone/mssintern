import java.util.Scanner;

public class DivisionException extends Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		System.out.println("Enter another number: ");
		int number1 = sc.nextInt();
		try {
			float div = number/number1;
			System.out.println(div);
		}
		catch(ArithmeticException a)
		{
			System.out.println(a);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Out of the block...!!!!");
		}
	}

}

