package javafun;
import java.util.Scanner;
public class Ftype {
	public static void main(String args[]) {
		int n;
		Scanner sc=new Scanner(System.in);
		char ch;
		System.out.println("enter a character");
		ch=sc.next().charAt(0);
		int ascii =ch;
		if((32<=ascii && ascii<=47) || (58<=ascii && ascii<=64) || (91<=ascii && ascii<=96)|| (123<=ascii && ascii<=127)) {
			System.out.println("it is a special symbol");
	    }
		else if((65<=ascii && ascii<=90)) {
			System.out.println("it is upper case letter");
		}
		else if((97<=ascii && ascii<=122)) {
			System.out.println("it is lowercase letter");
		}
		else {
			System.out.println("it is out of range:");
		}
}
}