import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n,i,fact=1;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to find factorial");
	n = sc.nextInt();
	for(i=1;i<=n;i++)
	{
		fact =fact*i;
	}
	System.out.println("Factorial is "+fact);
	}

}
