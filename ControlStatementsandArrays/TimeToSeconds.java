package ControlStatementsandArrays;
import java.util.Scanner;
public class TimeToSeconds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner in=new Scanner(System.in); 
			System.out.println("Enter Time in Minutes : "); 
			int sec=in.nextInt(); 
			int hours=sec*3600;
			System.out.println("Time in Hours : "+hours); 

	}

}
