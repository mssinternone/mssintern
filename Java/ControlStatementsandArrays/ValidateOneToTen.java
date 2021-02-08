package ControlStatementsandArrays;
import java.util.Scanner; 

public class ValidateOneToTen {

	public static void main(String...args) { 
	
		Scanner in=new Scanner(System.in); 
	    System.out.println("Enter a Number :");
	    int no = in.nextInt();  
	    if(no>0 && no<11) 
	    { 
	
	    	System.out.println("Validated !!!");
	    	}
	    else{
	    	
	    	System.out.println("Not - Validated !!!");
	    }
	
	}
	
}
