package projects;
import java.util.Scanner;
public class terenary2numbers {
	public static void main(String[] args) {
	int a,b,c;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the first number:");  
	a = s.nextInt();  
	System.out.println("Enter the second number:");  
	b = s.nextInt();  
	c=a > b ? a : b;
	System.out.println("the largest number is:"+c); 
	}
}

