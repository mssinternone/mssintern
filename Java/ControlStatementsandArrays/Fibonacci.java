package ControlStatementsandArrays;

import java.util.Scanner; 
	public class Fibonacci { 
	public static void main(String...args) {
	   
		Scanner in=new Scanner(System.in); 
	    System.out.println("Enter a Number :");
	    int no = in.nextInt(); 
	    int first=0;
	    int second=1; 
	    int third; 
	    System.out.printf("Fibonacci Series : %d  %d",first, second); 
	    for (int i=2;i<no;i++) 
	    { 
	
	    	third=first+second; 
	    	System.out.printf(" %d ",third); 
	    	first=second; 
	    	second=third; 
	    }
	}

}
