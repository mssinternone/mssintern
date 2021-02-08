import java.util.Scanner;
	public class pos_neg
	{
	    public static void main(String[] args) 
	    {
	        int num;
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter the number to check:");
	        num = scan.nextInt();
	        scan.close();
	        if(num > 0)
	        {
	            System.out.println(num+" is positive number");
	        }
	        else if(num < 0)
	        {
	            System.out.println(num+" is negative number");
	        }
	        else
	        {
	            System.out.println(num+" is neither positive nor negative");
	        }
	    }
	}


