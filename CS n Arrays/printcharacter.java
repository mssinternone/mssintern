package projects;
import java.util.*;
public class printcharacter {

	public static void main(String[] args)
	{
		 char val ='L';
	      System.out.println("Given Value: "+val);
	      if(val >= 97 && val <= 123) {
	         System.out.println("Lower Case");
	      } else if(val >= 65 && val <= 96) {
	         System.out.println("Upper Case");
	      } else if(val >= 48 && val <= 57) {
	         System.out.println("Digit");
	      } else if(Character.isWhitespace(val)) {
	         System.out.println("Whitespace");
	      }

	}

}
