package javaintern;

import java.util.Scanner;

public class prime
{

	 public static void main (String[] args)
	   {		
	       int i =0;
	       int num =0;
	       //Empty String
	       System.out.println("enter num ber");
	       Scanner sc=new Scanner(System.in);
             int n=sc.nextInt();
             
	       String  primeNumbers = "";

	       for (i = 1; i <= n; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     //Appended the Prime number to the String
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println("Prime numbers from 1 to"+n+"are :");
	       System.out.println(primeNumbers);
	   }

}
