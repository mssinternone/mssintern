package ControlStatementsandArrays;

import java.util.Scanner; 

public class MinMaxAvg { 

	public static void main(String...args) { 

		Scanner in=new Scanner(System.in); 
        System.out.println("Enter 10 numbers: "); 
        int sum=0; int max=0; 
        int min=999;
        for(int i=0;i<10; i++)
        { 

        	int n = in.nextInt();
        	sum+=n;
        	if(n>max)
        	{ 

        		max=n; 
        	}

        		if(n<min) 
        		{ 

        			min=n;
        		} 

        			System.out.printf("Sum : %d Min : %d Max: %d", sum,min,max); 
}
	}

	}