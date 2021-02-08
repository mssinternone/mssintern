package ControlStatementsandArrays;

import java.util.Scanner;

public class passOrFail {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("enter your marks");
		int result = obj.nextInt();
		
	    if(result>=35) {
	    	System.out.println("passed");
		if(result>80) {
			System.out.println( result + "you got A grade");
			
		}
		else if(result>=60  && result<=80){
			System.out.println(result + " you got B grade");
		}
		else if( result>=40 && result<60) {
			System.out.println(result + " you got C grade");
		}
		else
		{
			System.out.println(" you got D grade");
		}
	    }
	    else {
	    	
	    	System.out.println("fail");
	    	
	    }
		
		
		

	}

}
