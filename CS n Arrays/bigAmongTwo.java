import java.util.Scanner;

public class bigAmongTwo {

	public static void main(String[] args) {
		int x , y; 
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the 2 numbers to check big number:");
		x = scan.nextInt();
		y = scan.nextInt();
		
		if(x >y)
			System.out.print(x +"\tis big");
		else
			System.out.print(y +"\tis big");
	}

}
