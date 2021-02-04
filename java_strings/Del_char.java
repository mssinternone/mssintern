package java_strings;
import java.util.Scanner;

public class Del_char {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String str1 = sc.nextLine();
		char s = sc.next().charAt(0);
		
		String replacedCharacter = String.valueOf(s);
		String str2 = str1.replace(replacedCharacter," ");
		
		System.out.println(str2);
		
	}

}
