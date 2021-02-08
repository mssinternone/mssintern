import java.util.Scanner;
public class Validnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		number = scan.nextInt();
		if(number>=1 && number<=10)
		{
			System.out.println("Valid nmber ");
		}
		else
		{
			System.out.println("Enter between 1 to 10");
		}
	}

}
