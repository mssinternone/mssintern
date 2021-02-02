package javafun;
import java.util.Scanner;
public class Decimal2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 System.out.println("enter n to find sum of 1/1 + 1/2 + 1/2^2+ ....... + 1/2^n");
		 float n=scan.nextFloat();
		 float sum=0;
		for(float i=0;i<=n;i++) {
			sum+=1/Math.pow(2, i);	
			System.out.println(sum);
		}
		System.out.println(sum);
	}
}

