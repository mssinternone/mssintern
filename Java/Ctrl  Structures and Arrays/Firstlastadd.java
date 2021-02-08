import java.util.Scanner;
public class Firstlastadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a long number:");
		int n= scan.nextInt();
		int temp=0;
		int last=n%10;
		while(n!=0) {
			temp=temp*10+(n%10);
			n=n/10;
		}
		int first=temp%10;
		System.out.println(first);
		System.out.println(last);
		System.out.println(first+last);

	}

}
