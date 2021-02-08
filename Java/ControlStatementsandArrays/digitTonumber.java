package ControlStatementsandArrays;

import java.util.Scanner; 

public class digitTonumber {

	  public static void main(String...args) { 
	
		  Scanner in=new Scanner(System.in); 
	      System.out.println("Enter a Number :"); 
	      int no = in.nextInt(); 
	      String[] digits_words_arr= {"Zero","One","TWO","Three","Four","Five","Six", "Seven","Eight", "Nine"}; 
	      int rev=0; 
	      while(no!=0)
	      { 
	          rev=rev*10+(no%10);
	          no=no/10; 
	      }
	      while(rev!=0) 
	      { 
	          System.out.printf("%s", digits_words_arr[rev%10]); 
	          rev=rev/10; 
	      }
	  }
	}
