package javafun;
import java.util.Scanner;
public class Biggest {

	 public static void main(String args[]) {
		 int a,b,c;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter a, b, c values:");
		 a=sc.nextInt();
		 b=sc.nextInt();
		 c=sc.nextInt();
		 if(a>b && a>c) {
			 System.out.println(a+" is biigest");
		 }
		 else if(b>c) {
			 System.out.println(b+" is biggest");
		 }
		 else {
			 System.out.println(c+" is biggest");
		 }
	 }
}
