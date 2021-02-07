package strings;
import java.util.*;
public class removestring {

	public static void main(String[] args)
	{
		System.out.println("Enter a string::");
		Scanner obj=new Scanner(System.in);
		String s=obj.nextLine();
		for(int i=0;i<s.length();i++) {
			System.out.println("Enter a character to delete");
			char c=obj.next().charAt(0);
			String s3=String.valueOf(c);
			s=s.replace(s3,"");
			System.out.println(s);
			System.out.println("if You want to Continue for removing the character enter n or if you want exit enter y::");
			char c1=obj.next().charAt(0);
			if(c1=='y') {
				System.exit(1);
			}
		}
	}
}
	
		
		 
		
	
