package javaintern;
import java.util.InputMismatchException;
import java.util.Scanner;
public class range
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	
			 
		      Scanner sc = new Scanner(System.in);
		 
		      int number = 0;
		      while (true) {
		         try {
		            System.out.print("Enter number betwen 1 and 10: ");
		            number = sc.nextInt();
		            if( number >= 1 && number <= 10){
		              break;
		            }
		            System.out.println("Out of range.");
		 
		         }
		         catch (InputMismatchException e) {
		            System.out.println("You did not enter a Integer.");
		            sc.nextLine(); // needed to clear buffer
		         }
		      }
		      System.out.println("You entered: " + number);
		   }

	}

