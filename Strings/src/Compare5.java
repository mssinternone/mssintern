import java.util.*;
public class Compare5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first string");
    String s1=sc.nextLine();
    System.out.println("Second first string");
    String s2=sc.nextLine();
    int count=0;
    char[] a=new char[s1.length()];
    if(s1.length()==s2.length())
    {
    for(int i=0;i<s1.length();i++)
    {
    	if(s1.charAt(i)==s2.charAt(i))
    	{
    		count++;
    		if(count==s1.length())
    		{
    			System.out.println("Two strings are same");
    			break;
    		}
    	}
    	else
    	{
    		System.out.println("Two strings are not same");
    		break;
    	}
    }
    }
    else
    {
    	System.out.println("Two strings are not same");	
    }
    
    {
    	
    }
	}
}
