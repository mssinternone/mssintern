import java.util.Scanner;
public class months {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("1.January 2.February 3.March 4.April 5.May 6.June 7.July8.August 9.September10.October11.November12.December");
		input = sc.nextInt();
		switch(input)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 days");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 days");
			break;
		case 2:
			System.out.println("29 days");
			break;
		default:
			System.out.println("Invalid choice!!!");
		}
		
	}

}
