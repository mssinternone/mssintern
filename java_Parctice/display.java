package java_Parctice;
import java.util.Scanner;

public class display {
	public static void main(String[] args)
	{
		char ch;
		Scanner sc = new Scanner(System.in);

		ch = sc.next().charAt(0);
		System.out.println("You entered "+ ch);
	}

}
