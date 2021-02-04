import java.util.*;
public class hello {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
           String s="Hello world";  //101
           String s1= new String("welcome to mss");
           String s2="Hello world";//101
           System.out.println(s);
           System.out.println(s1);
          //returns false because it checks the content in the two strings
           
           //== operators
           System.out.println(s==s2);//returns true because both the string are referencing in the same constant pool
           System.out.println(s==s1);//returns false because n=s is referencing in constant pool and s1 in buffer pool
           
         //  s = s1;
           //System.out.println(s);
           //s1 = s2;
           //System.out.println(s1);
           
          s= s1.concat(s);
           System.out.println(s2);
           System.out.println(s);
	}

}
