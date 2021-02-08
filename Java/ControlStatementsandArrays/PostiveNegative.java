package ControlStatementsandArrays;
import java.util.Scanner;
public class PostiveNegative {

	public static void main(String[] args) {
	int x;
	Scanner obj = new Scanner(System.in);
	System.out.println("enter a number");
	x=obj.nextInt();
	if(x>0) {
		System.out.println(x +" positive number");
	}
	else {
		
		System.out.println(x +" negative number");
	}
	}

}
