package Strings;

import java.util.Scanner;

public class LengthOfString {
	
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String : ");
	String str1 = sc.nextLine();
	int i=0;
	for(char c : str1.toCharArray())
	{
	i++;
	}
	System.out.println("Length of the given string : " + i);

}
}
