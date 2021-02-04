package java_Parctice;
import java.util.Scanner;

public class Ternary_comparision {
	public static void main(String[] args)
	{
		int x,y;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		
		String str  = (x>y)? x+" is bigger" : y+ " is bigger ";
		System.out.println(str);
	}

}
