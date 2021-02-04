package java_Parctice;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args)
	{
		int num;
		Scanner obj = new Scanner(System.in);
		
		num = obj.nextInt();
		
		for(int i=0;i<num;i++)
		{
			System.out.println( "x^"+i+ "/" + i + "!+");
		}
		obj.close();	
		
	}
	

}
