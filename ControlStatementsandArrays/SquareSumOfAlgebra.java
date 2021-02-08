package ControlStatementsandArrays;

import java.util.Scanner;
public class SquareSumOfAlgebra {

	
	 public static void main(String... args) { 
	 
		 Scanner in=new Scanner(System.in); 
	     System.out.println("Enter n :");
	     int no=in.nextInt(); 
	     float sum=0; 
	     for(int i=1;i<=no;i++)
	     { 
	        sum=sum+ ((float) 1/(float)i); 
	     }
	        System.out.println("Result:"+sum); 
	     }

}