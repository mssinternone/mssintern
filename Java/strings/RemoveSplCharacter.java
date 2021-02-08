package strings;

import java.util.Scanner;
public class RemoveSplCharacter {

	public static void main(String[] args) {

       String str;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter a string");
	   str=sc.nextLine();

	   str = str.replaceAll("[^a-zA-Z0-9]", " ");  
	   System.out.println(str);  

	   
	  
	   
	}

	}


	
	

