package javafun;
import java.util.Scanner;
public class Leapyear {

	 public static void main(String args[]) {
		 Scanner ob=new Scanner(System.in);
		 System.out.println("enter a year...");
		 int year=ob.nextInt();
		 if(year%400==0) {
			 System.out.println(year+" is leap year..");
		 }
		 else if(year%4==0){
			 if(year%100==0) {
				 System.out.println(year+" is not leap year..");
				 
			 }
			 else {
				 System.out.println(year +" is a leap year...");
			 }
		 }
		 else {
			 System.out.println(year+" is utterly not a leap year");
		 }
	 }
}
