import java.util.Scanner;

public class leapornot {

	public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
		    System.out.print("enter a year");
	        int year=sc.nextInt();
	              if (year%400==0) {
			    System.out.printf("%d is a leap year",year); 
	              }
	               	else if(year%100==0) {
	               	
			    System.out.printf("%d is not a leap year",year);
	               	}
	               	else if(year%4==0) {
			System.out.printf("%d is a leap year",year);
	               	}
	               	else {
	               		System.out.printf("%d is not a leap year",year);                   
	 	}
	}

	}
