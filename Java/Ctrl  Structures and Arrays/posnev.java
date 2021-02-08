import java.util.Scanner;
public class posnev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		number = scan.nextInt();
		if (number>0) {
			System.out.println("Positive number");
		}
		else {
			System.out.println("Negative number");
		}
		

	}

}
