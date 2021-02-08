package strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		int c=0;
		//System.out.println("enter a string");
		Scanner sc = new Scanner(System.in);
		//Scanner readStr = new Scanner(System.in);  // Reading from System.in
		 System.out.println("Enter a String to reverse: ");
		        String str = sc.nextLine();      
		        String strRev = "";
		             for(int i = str.length()-1;i>=0;i--)
		             {
		            strRev = strRev + str.charAt(i);
		              }
		           if(str.equals(strRev))
		           {
		          System.out.println("palindrome");
		           }
		           else {
		          System.out.println("not a palindrome");
		           }
	}
		         
	}


	
	
	
