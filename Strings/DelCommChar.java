package Strings;
import java.util.*;
public class DelCommChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter two Strings  ");
		
		String str1 = sc.nextLine();
		 String str2=sc.nextLine();
		
		 for(int i=0;i<str1.length();i++) {
			
			 for(int j=0;j<str2.length();j++) {
				
				 if(str1.charAt(i)==str2.charAt(j)) {
					
					str1= str1.replace(str1.charAt(i)+"","" );
					System.out.println(str1);
					str2= str2.replace(str2.charAt(j)+"","" );
					System.out.println(str2);
				 }
			 }
		 }
		 
	}

}
