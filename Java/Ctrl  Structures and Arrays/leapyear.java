import java.util.Scanner;
public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check leap year or not");
		number = scan.nextInt();
		if( number%4 ==0 )
		{
			if (number % 100 ==0) {
				System.out.println("Leap year");
			}
			else {
				System.out.println("Not a leap year");
			}
		
		}

	}
}
