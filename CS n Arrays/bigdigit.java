package projects;
import java.util.Scanner;
public class bigdigit {

	public static void main(String[] args) {
		Scanner obj = new Scanner (System.in);
	       System.out.println ("Enter the number");
	     int n = obj.nextInt ();
	     int reminder, big= 0;
	    while (n > 0)
	    {
	        reminder = n % 10;
	        if (big< reminder) 
	        {
	            big= reminder;
	        }
	        n = n / 10;
	    }
	    System.out.println("\nThe big Digit is "+big);

	 
	 }
	}


