package java_Parctice;
import java.util.Scanner;

public class Sequence {
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		double res = 0 ;
		
		for(int i=0;i<num;i++)
		{
			res = res + (1/(Math.pow(2, i)));
		}
		
		System.out.println(res);
	
		obj.close();
	}

}