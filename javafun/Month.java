package javafun;
import java.util.Scanner;
public class Month {
          
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==2) {
			System.out.println("28 or 29 days in february");
		}
		else if(n==1 || n==3 || n==5 || n==7|| n==8 || n==10 || n==12) {
			System.out.println("31 days");
		}
		else {
			System.out.println("30 days");
		}
	}
}
