import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,i,c,a=0,b=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		number = scan.nextInt();
		for(i =2;i<=number;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}
