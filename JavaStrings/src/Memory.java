import java.io.*;
public class Memory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 String s1="hello rak's";
     String s2="welcome to world";
     System.out.println(s1);
     System.out.println(Integer.toHexString(s1.hashCode()));
     
     System.out.println(s2);
     System.out.println(Integer.toHexString(s2.hashCode()));

	s1="welcome";
	 System.out.println(s1);
     System.out.println(Integer.toHexString(s1.hashCode()));
	}
}