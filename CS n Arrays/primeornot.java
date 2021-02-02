package projects;
import java.util.*;
public class primeornot {

	public static void main(String[] args) {
		  System.out.println("Enter a number to check prime or not::");
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	     
	     if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  }
	}

