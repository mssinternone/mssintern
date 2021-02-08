import java.util.Scanner;
public class divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		number = scan.nextInt();
		if (number%3 ==0 || number%5 ==0) {
			System.out.println("The number is divisible by both 3 an 5");
		}
		

	}

}
