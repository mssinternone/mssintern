package java_Parctice;
import java.util.Scanner;

public class Even_lst_loops {
	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println("Printing Even numbers using for loop :=");
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+"\n");
			}
		}
		
		System.out.println("Printing Even numbers using while loop :=");
		
		int j=1;
		while(j<=num)
		{
		
			if(j%2==0)
			{
				System.out.println(j+"\n");
				j++;
			}
		}
		
		System.out.println("Printing Even numbers using do-while loop :=");
		int k=1;
		do
		{
		
			if(k%2 == 0)
			{
				System.out.println(k+"\n");
				k++;
			}
		}while(k <= num);
		
	}

}
