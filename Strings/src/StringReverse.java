import java.util.*;
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner(System.in);
       String a=sc.nextLine();
       char[] b=new char[a.length()];
       for(int i=0;i<a.length();i++)
       {
    	   b[i]=a.charAt(a.length()-i-1);
    	   System.out.print(b[i]);
       }
	}

}
