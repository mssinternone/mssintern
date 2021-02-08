import java.util.Scanner;
public class Bignumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
			  Scanner cs = new Scanner (System.in);
			       System.out.println ("Enter the number");
			     int num = cs.nextInt ();
			     int rem, Lar= 0;
			    while (num > 0)
			    {
			        rem = num % 10;
			        if (Lar< rem) 
			        {
			            Lar= rem;
			        }
			        num = num / 10;
			    }
			    System.out.println("\nThe Largest Digit is "+Lar);
		 }
	
	}


