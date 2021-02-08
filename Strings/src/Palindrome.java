import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	String str=s.next();
	char[] b=new char[str.length()];
	int c=str.length();int count=0;
	for(int i=0;i<c;i++)
	{
		b[i]=str.charAt(i);
		
	}
	for(int j=0;j<=c/2;j++)
	{
		if (b[j]==b[(c-1)-j])
	{
		count++;
	}
      c--;
	}
     if (count>=c/2)
     {
    	 System.out.println("Your String is palindrome");
     }
     else
     {
    	 System.out.println("Your String is not palindrome"); 
     }
	}
}

