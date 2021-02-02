package projects;
import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
		   int  t1 = 0, t2 = 1;
		   Scanner obj=new Scanner(System.in);
		   System.out.print("enter the digit upto::" );
		   int n=obj.nextInt();
		   
		 
	        System.out.print("Upto " + n + ": ");
	        while (t1 <= n)
	        {
	            System.out.print(t1 + " ");

	            int sum = t1 + t2;
	            t1 = t2;
	            t2 = sum;
	        }
	    }

	}


