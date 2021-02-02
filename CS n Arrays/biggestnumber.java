package projects;
import java.util.Scanner;
public class biggestnumber {

	public static void main(String[] args) {
		int m,n;
		System.out.println("enter the numberto check biggest number or not::");
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		if(m>n)
		{
			System.out.println("the biggest number is"+m);
		}
		else if(m<n)
		{
			System.out.println("the biggest number is"+n);
			
		} else {
			System.out.println("both are equal");
			
		}

	}

}
