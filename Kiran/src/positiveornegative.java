import java.util.Scanner;

public class positiveornegative {
	public static void main(String[]args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int number=sc.nextInt();
	if(number>=0)
	{
		System.out.println("positive number");
	}
	else
	{
		System.out.println("negative number");
	}
	
	}
}
