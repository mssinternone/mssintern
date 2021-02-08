import java.util.Scanner;
public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,time;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to convert time into hours =");
		number = scan.nextInt();
		time = 3600*number;
		System.out.println("Seconds ="+time);
	}

}
