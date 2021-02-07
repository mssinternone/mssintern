package strings;
import java.util.*;
public class reversestring {

	public static void main(String[] args) {
		String s;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a string : ");
		s=obj.nextLine();	 
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
			
		}
		
	}

}
