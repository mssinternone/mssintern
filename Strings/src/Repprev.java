import java.util.*;
public class Repprev {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter string");
		String s1=scan.nextLine();
		char[] words=s1.toCharArray();
		
		for(int i=0;i<words.length;i++) {
			if(Character.isWhitespace(words[i]))
			{
				words[i+1]=words[i-1];
			}
			}
		System.out.println(words);
		}
}