package javaintern;
import java.util.Scanner;
public class time
{
	public static void main(String...args) 
	{ 
		Scanner in=new Scanner(System.in); 
		System.out.println("Enter Time in Minutes : "); 
		int sec=in.nextInt(); 
		int hours=sec*3600; 
		System.out.println("Time in Hours : "+hours); 

}
}