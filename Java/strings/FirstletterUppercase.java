package strings;

import java.util.Scanner;
public class FirstletterUppercase
{

	public static void main(String args[])
	{
		String sent;
		Scanner str = new Scanner(System.in);
		System.out.println("Enter a sentence : ");
		sent = str.nextLine();
		sent=" "+sent;
		String f="";
		
		 for(int i=0; i<sent.length(); i++)
	       {
	          char ch =sent.charAt(i);
	          if(ch ==' ')
	          {
	        	  f=f+ch;
	        	  i++;
	        	  ch=Character.toUpperCase(sent.charAt(i));
	        	  String s1=String.valueOf(ch);
	        	  f=f+ch+"";
	          }
	          else
	          {
	        	  f=f+ch;
	          }
			
	       }
	     f=  f.trim();
		 System.out.println(f);
	}	
	}
