package strings;
import java.util.*;
public class noofwords {

	public static void main(String[] args) {
		String s = "hello this is bineetha 123@";
		count(s);
	}
	public static void count(String x){
		char[] ch = x.toCharArray();
		int letter = 0,space=0,num=0,other=0;
		for(int i = 0; i < x.length(); i++){
			if(Character.isLetter(ch[i])){
				letter ++ ;
			}
			else if(Character.isDigit(ch[i])){
				num ++ ;
			}
			else if(Character.isSpaceChar(ch[i])){
				space ++ ;
			}
			else{
				other ++;
			}
		}
		System.out.println("The string is : Hello this is bineetha 123@");
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("other: " + other);

	}

}
