package javafun;

import java.util.Scanner;
public class Prime3{
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int count=1,n,sum=0;
		System.out.println("enter a number");
		n=sc.nextInt();
		for(int i=1;i<n||count<=n;i++) 
		{
			for (int j=1;j<=i;j++)
			{
				if(i%j==0) {
					sum=sum+1;
				   }
			}
			
			if(sum==2)
			{
			System.out.println(i);count=count+1;
			}
			sum=0;
	   }
    }
}

