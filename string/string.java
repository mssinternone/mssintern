import java.util.*;
public class string
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		    Scanner in=new Scanner(System.in);
		System.out.println("How many name do you want to enter ? ");
		int no=in.nextInt();
		String[] StringInputArray=new String[no];

		System.out.println("Enter "+(no-1)+" Strings : ");
		for(int i=0;i<no;i++)
		{
		StringInputArray[i]=in.nextLine();
		}

		System.out.println("Enter Character to search names : ");
		char charchoice=in.next().charAt(0);
		System.out.printf("\n\nThe Strings are : ");
		for(int i=1;i<no;i++)
		{
		if(StringInputArray[i].charAt(0)==charchoice)
		{
		System.out.printf(" %s",StringInputArray[i]);
		}
		}

	}
}



