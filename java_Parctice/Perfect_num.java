package java_Parctice;
import java.util.Scanner;

public class Perfect_num {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("perfect or not");
		int n=scan.nextInt();
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0)
				sum+=i;
		}
		if(sum==n)
			System.out.println(n+" is perfect");
		else
			System.out.println(n+" is not perfect number");
	}
}
