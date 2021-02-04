package java_Parctice;
import java.util.Scanner;

public class N_dig {
	public static void main(String[] args)
	{
	
		int count1=0;
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		while(num!=0)
		{	
			num = num/10;
			count1 = count1+1;
		}
		sc.close();
	}

}
