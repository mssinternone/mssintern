package java_strings;
import java.util.Scanner;

public class Chars_word_count {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		int count=0,w_count=0;
		
		
		char[] str_arr = new char[str1.length()];
		
		for(int i=0;i<str1.length();i++)
		{
			str_arr[i] = str1.charAt(i);
			//char count
			if(str_arr[i]!=' ')
			{
				count++;
			}
			
			//word count
			
			if((str_arr[0]!=' ') && (i==0)  ||(i>0) && str_arr[i-1]==' ' && str_arr[i]!=' ')
				
			{
				w_count++;
			}
			
		}
		
		System.out.println("Total number of Characters = "+count);
		System.out.println("Total number of words = "+w_count);
		
		
//		for(int i=0;i<str1.length();i++)
//		{
//			if(str1.charAt(i)!=' ' )
//			{
//				count++;
//				
//			}
//			else if(str1.charAt(i+1)!=' ' && str1!=" ")
//			{
//				w_count++;
//			}
//		
//		}
		
		
		
	}

}
