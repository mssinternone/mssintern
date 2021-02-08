import java.util.Scanner;
public class stringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first name: ");
	String first = sc.nextLine();
	System.out.println("Enter second name: ");
	String second =sc.nextLine();
	if(first.length() == second.length())
	{	int count = 0;
		for(int i = 0; i<first.length(); i++)
		{
			if(first.charAt(i)==second.charAt(i))
			{
				count = count+1;
			}
			
		}
		if(count==first.length()) 
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings not equal");
		}
	}
	else 
	{
		System.out.println("Entered strings are not having same length!!!");
	}
	}

}
