package divbytwonumbers;
import java.util.Scanner;
public class divisions {

	public static void main(String[] args) {
		int b;
		System.out.println("enter the number::");
		Scanner sc = new Scanner(System.in);
		b = sc.nextInt();
		if((b % 3 == 0) && (b % 5 == 0))
		{
			System.out.println("the number is divisible by both 3 and 5");
		} else
		{
			
			System.out.println("the number is not divisible by both 3 and 5");
	}

}
}
