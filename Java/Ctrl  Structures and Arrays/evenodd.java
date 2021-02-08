import java.util.Scanner;
public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check the given number is even or odd");
		number = scan.nextInt();
		if(number%2 == 0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");
		}

		}
	}


