package strings;

import java.util.Scanner;

public class VowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter a string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int vcount = 0, ccount = 0;

		       
		        str = str.toLowerCase();
		        for(int i = 0; i < str.length(); i++) {
		        char ch = str.charAt(i);
		        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		        {
		        vcount++;
		        }
		        else if((ch >= 'a'&& ch <= 'z'))
		        {
		        ccount++;
		        }
		               
		            }
		       
		        System.out.println("Num of Vowels: " + vcount);
		        System.out.println("Num of Consonants: " + ccount);
		    }

		
	}


