package ControlStatementsandArrays;

import java.util.Scanner;

public class Palindrome {

	 public static void main(String... args) { 
	
		 Scanner in=new Scanner(System.in); 
	     System.out.println("Enter a Number :"); 
	     int no = in.nextInt(); 
	     int temp=no; 
	     int rev=0; 
	     while(no!=0)
	     { 
	         rev=rev*10+(no%10); 
	         no=no/10;
	     }
	     if(temp==rev)
	     { 
	          System.out.println("Palindrome"); 
	     }
	     else{ 
	          System.out.println("Not a Palindrome");
	     }

	 }
	
}
