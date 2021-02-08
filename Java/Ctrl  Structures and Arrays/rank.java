import java.util.Scanner;
public class rank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number to check whether you passed or not");
		number = scan.nextInt();
		if(number >=40) {
			System.out.println("You passed");
		}
		else
		{
			System.out.println("You failed");
		}
	}

}
