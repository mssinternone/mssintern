package javaintern;
import java.util.Scanner;
public class student {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Enter Student marks");
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		if(n>=99)
		{
			System.out.println("student passed and got A+");
			
		}
		else
		{
			System.out.println("student failed99");
		}
	}

}
