import java.util.*;
public class memory
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
                String s="  hello world  ";
                String s1="hello world";
                System.out.println(s.trim());
                System.out.println(Integer.toHexString(s.hashCode()));
                System.out.println(s1);
                System.out.println(Integer.toHexString(s1.hashCode()));
                 s1="welcome";
                 System.out.println(s1);
                 System.out.println(Integer.toHexString(s1.hashCode()));
                 
                 System.out.println("\nreturns lenth of a string");
                 System.out.println(s.length());
                 System.out.println("prints lower case");
                 System.out.println(s.toUpperCase());
                 System.out.println(":\n value of method");
                 System.out.println(s.valueOf(s));
                 System.out.println("\n trim method");
                 System.out.println(s.trim());
                 
	}

}
