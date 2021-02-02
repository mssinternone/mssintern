package javaintern;
import java.util.Scanner;
public class ternary {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("enter three numbers to compare by using ternary operators");
		Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int c=sc.nextInt();
	    if((a>b)&&(b>c))
	    {
	    	System.out.println("A is big");
	    	}
	    else if((b>c)&&(b>a))
	    {
	    	System.out.println("B is big");
	    }
	    else
	    {
	    	System.out.println("C is big");
	    }
	}

}
