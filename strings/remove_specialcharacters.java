package strings;
import java.util.Scanner;
public class remove_specialcharacters {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		 System.out.println("enter a word");
		 String str=s.nextLine();
		 for (int i = 0; i < str.length(); i++)
		 {
		 if (str.charAt(i) >='A' && str.charAt(i) <= 'Z' || str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
		 {
		 System.out.print(str.charAt(i));
		 }
		 }

	}
}
