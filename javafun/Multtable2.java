package javafun;

import java.util.Scanner;
public class Multtable2{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter which table");
		int num = scan.nextInt();
		System.out.println("how many rows");
		int limit = scan.nextInt();
		int i=1;
		do{
			System.out.println(num+" x "+i+" = "+num*i);
			i++;
		}while(i<=limit);
	}
}
