import java.util.Scanner;
public class firstNlast {
	public static void main(String[] args) {
		int sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number of numbers you  want to enter");
		int n= scan.nextInt();
		int temp=0;
		int las=n%10;
		while(n!=0) {
			temp=temp*10+(n%10);
			n=n/10;
		}
		int f=temp%10;
		System.out.println(f+las);
	}
}
