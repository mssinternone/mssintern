package javafun;
import java.util.Scanner;
public class Sumofeven {

	 public static void main(String[] args) {
		 int n;
		 int sum=0;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter a number to find sum ");
		 n=sc.nextInt();
		 for(int i=2;i<=n;i++) {
			 if(i%2==0) {
				 sum=sum+i;
			 }
		 }
		 System.out.println("sum of even numbers "+sum);
	 }
	
	
}
