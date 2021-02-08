import java.util.Arrays;
import java.util.Scanner;

public class OnlyCharacters {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count=0;
	    System.out.println("Enter string");
	    String s=sc.nextLine();
	    char[] a=s.toCharArray();
	   for(int i=0;i<s.length();i++)
	   {
		   int b=(int)a[i];
		   if(b>=90&&b<=65 ||b>=97&&b<=122)
		   {
			   
		   }
	   }
	}
}
