package javafun;
import java.util.Scanner;
public class Decimal {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	 System.out.println("enter n to find sum upto n");
	 float n=scan.nextFloat();
	 float sum=0;
	for(float i=1;i<=n;i++) {
		sum+=1/i;	
	}
	System.out.println(sum);
}
}

