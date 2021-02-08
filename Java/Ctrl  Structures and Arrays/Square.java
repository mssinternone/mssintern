import java.util.Scanner;
public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0, i =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find squares");
		n = sc.nextInt();
		for(i = 1; i<=n ; i++)
		{
			System.out.println("Square of "+ i + " is:" +i*i);
		}
	}

}
