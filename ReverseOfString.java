import java.util.*;
public class ReverseOfString
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String to reverse");
		String s= sc.nextLine();
		for(int i=s.length(); i>=1; i--)
		{
		   System.out.print(s.charAt(i-1));
		}
		System.out.println(" ");
     int m=0;
     for(int i=0; i<s.length(); i++)
     {
    	if(s.charAt(i)==' ')
    	{
    		for(int j=i-1; j>m-1; j--)
    		{
    			System.out.print(s.charAt(j));
    		}
    		System.out.print(" ");
    		m=i+1;
    	}
     }
     for (int i=s.length()-1; i>=m; i--)
     {
    	 System.out.print(s.charAt(i));
     }
	}

}
