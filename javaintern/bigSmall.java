package javaintern;
import java.util.Scanner;
public class bigSmall {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
            System.out.println("Enter two numbers to check which one is big");
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            
            if(a>b)
            {
            	 System.out.println(a+" A is big");
            }
            else
            {
            	 System.out.println(b+"B is big");
            }
	}

}
