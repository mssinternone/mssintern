import java.util.*;
public class UpperCase
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String s= sc.nextLine();
		
		String f="";
		s=s.trim();
		s=" "+s;
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if(ch ==' ')
			{   f= f+ch;
				i++;
				 ch=Character.toUpperCase(s.charAt(i));
				 String s1 =String.valueOf(ch);
				f= f+ ch+"";
				
			}
			else
			{
				f=f+ch;
			}
			
		}
		f=f.trim();
		System.out.println(f);
		
	}

}
