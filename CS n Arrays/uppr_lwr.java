import java.util.Scanner;
public class uppr_lwr
{
	public static void main(String[] args)
	{	
		Scanner s = new Scanner(System.in);	
		System.out.println("Enter a character : ");
		char c = s.next().charAt(0);
		int n = c;		
		if(c >=65 && c <=90)
			System.out.println("Uppercase");		
		else if(c >= 97 && c <=122 )
			System.out.println("Lowercase");	
		else if(c >=48 && c <= 57)
			System.out.println("Digit");	
		else
			System.out.println("Special Character");
			System.out.println("ASCII value : "+n);
		s.close();
	}
}