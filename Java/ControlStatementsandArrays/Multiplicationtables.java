package ControlStatementsandArrays;

import java.util.Scanner; 
public class Multiplicationtables {

	public static void main(String[] args) { 
	
		Scanner in=new Scanner(System.in); 
	    System.out.println("Enter number to print Mutiplication table of : ");
	    int n = in.nextInt(); 
	    int i=1;
	    do 
	    { 
	      System.out.println( n +" * " + i + " : " + n*i ); 
	      i++; 
	    }while(i<=12);
	
	}	
}
