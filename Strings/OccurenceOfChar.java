package Strings;

import java.util.Scanner;

public class OccurenceOfChar {

	public static void main(String[] args) {
		int c=0;
		System.out.println("enter a string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int len=s.length();
		for(int i=0;i<len;i++) {
		for(int j=0;j<len;j++) {
		if(s.charAt(i)==s.charAt(j)) {
		c++;
		}
		}
		System.out.println("occurence of "+s.charAt(i)+":"+c);
		c=0;
		}
	}

}
