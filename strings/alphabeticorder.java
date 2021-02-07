package strings;
import java.util.*;
public class alphabeticorder {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("enter a word");
		String str = a.nextLine();
		     char charArray[] = str.toCharArray();
		     Arrays.sort(charArray);
		     System.out.println(new String(charArray));
	}

}
