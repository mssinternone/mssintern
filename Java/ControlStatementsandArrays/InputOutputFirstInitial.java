package ControlStatementsandArrays;


import java.util.Scanner; 
public class InputOutputFirstInitial {
	
	public static void main(String...args) { 
	
		Scanner in=new Scanner(System.in); 
	    System.out.println("Enter your First initial : ");
	    char yourFirstlnitital=in.next().charAt(0); 
	    System.out.println("Your First Initial :"+yourFirstlnitital); 

	}
	
}
