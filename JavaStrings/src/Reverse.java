import java.util.Scanner;

public class Reverse
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in); 
	System.out.println("Enter  Strings  to compare:");
	String name1= sc.nextLine(); 
	int len=name1.length();
	System.out.println(len);
	for(int i=len-1;i>=0;i--) {
	 
		System.out.print(name1.charAt(i));
		
	}
}
}