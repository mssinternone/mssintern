import java.util.Scanner;
public class biggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		a = scan.nextInt();
		b = scan.nextInt();
		if(a<b)
		{
			System.out.printf("Biggest number is "+b);
		}
		else
		{ 
			System.out.printf("Biggest number is "+a);
		}
	
	}

}
