package projects;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		 System.out.println("Enter a number : ");
	        Scanner obj = new Scanner(System.in);
	        int number = obj.nextInt();

	        int originalNumber = number;
	        int reminder = 0;
	        int reversedNumber = 0;
	        for (; number != 0;) 
	        {

	            reminder = number % 10;
	            reversedNumber = reversedNumber * 10 + reminder;
	            number = number / 10;
	        }

	        System.out.println("Reversed Number : " + reversedNumber);

	        if (originalNumber == reversedNumber) {
	            System.out.println("Number " + originalNumber + " is a palindrome");
	        } else {
	            System.out.println("Number " + originalNumber + " is not a palindrome");
	        }
	    }
	

	}


