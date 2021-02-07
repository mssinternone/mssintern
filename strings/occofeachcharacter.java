package strings;
import java.util.*;
public class occofeachcharacter {

	public static void main(String[] args) {
		 String str;
	       int i, counter[] = new int[256];
	       Scanner s = new Scanner(System.in);
	       System.out.println("Enter a String");
	       str = s.nextLine();
	       int length = str.length();       
	       for (i = 0; i < length; i++) {
	           counter[(int) str.charAt(i)]++;
	       }     
	       for (i = 0; i < 256; i++) {
	           if (counter[i] != 0) {
	               System.out.println((char) i + " --> " + counter[i]);
	}

}
}
}