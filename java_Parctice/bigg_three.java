package java_Parctice;
import java.util.Scanner;

public class bigg_three {
	public static void main(String[] args)
	{
		int x,y,z;
		
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		
		String res = (x>y && x>z)?  x+" is the biggest one" : ((y>z)? y+" is the biggest one": z+" ");
		System.out.println(res);
		
	}

}
