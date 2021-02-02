package javafun;
import java.util.Scanner;
public class Multtable {
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int a=sc.nextInt();
		System.out.println("table for "+a+":");
		for(int i=1;i<=10;i++) {
			System.out.println(a+"*"+i+"="+a*i);
			
		}
		
	}
	
	
}
