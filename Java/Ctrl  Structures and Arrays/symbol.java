import java.util.Scanner;


public class symbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		char ch =0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any key :");
		ch =  scan.next().charAt(0);
		if(ch >='A' && ch<='Z')
		{
			System.out.println("Capital letters");
		}
		else if( ch >='a' && ch<='z') {
			System.out.println("Small letters");
		}
		else if(ch >= 48 && ch <= 57) {
			   System.out.println("Digit");
			}
		else 
		{
			System.out.println("Special Characters");
		}

	}

}
