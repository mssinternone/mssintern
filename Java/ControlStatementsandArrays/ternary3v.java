package ControlStatementsandArrays;
import java.util.Scanner;
public class ternary3v {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,d;
		System.out.println("Enter a value:");
        a = sc.nextInt();
        System.out.println("Enter b value:");
        b = sc.nextInt();
        System.out.println("Enter c value:");
        c = sc.nextInt();
        //using ternary operator
        d = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        System.out.println("Largest Number:"+d);
		

	}

}
