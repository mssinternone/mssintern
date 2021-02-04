package java_Parctice;
import java.util.Scanner;

public class Fraction_sum {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		float res =0 ;
		
		for(int i=0;i<num;i++)
		{
			res = res + (1/i); 
		}
		
		System.out.println(res);
		sc.close();
		
	}
	

}
