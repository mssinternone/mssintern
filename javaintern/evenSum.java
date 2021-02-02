package javaintern;

import java.util.Scanner;

public class evenSum 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter a Number TO Print Even Number ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	int sum=0;
		for(int i=2; i<n; i+=2)
		{
			
			sum=sum+i;
			
			}
		System.out.println(sum);
	
			
		}

	}


