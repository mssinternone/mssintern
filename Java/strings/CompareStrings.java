package strings;

import java.util.Scanner;
public class CompareStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 , str2;
		Scanner st = new Scanner(System.in);
		System.out.println("Enter string1 : ");
		str1 = st.nextLine();
		System.out.println("Enter string2 : ");
		str2 = st.nextLine();
		
		System.out.println(str1.equals(str2));
	  		
	}

}
