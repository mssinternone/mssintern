package strings;

import java.util.Scanner;
public class DeleteNcharacters {

	public static void main(String args[])
	{
		String txt;
		Scanner str = new Scanner(System.in);
		System.out.println("Enter a string : ");
		txt = str.nextLine();
		char x;
		System.out.println("Enter a character that you want to delete from the string : ");
		x = str.next().charAt(0);
		for(int i = 0; i<txt.length() ;i++)
		{
			if(txt.charAt(i) == x)
			{
				String s1=String.valueOf(x);
			txt=txt.replace(s1, "");
			}
			
		}
		System.out.println(txt);
		
	}
}
