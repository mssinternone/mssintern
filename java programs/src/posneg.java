import java.util.Scanner;

public class posneg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
         System.out.println("enter a number to check whether the number is positive or negative");
         Scanner scan = new Scanner(System.in);
         num = scan.nextInt();
       
         if(num>0)
         {
        	 System.out.println("number is positive");
         }
         else
         {
        	 System.out.println("number is negative");
         }
	
	}
	

}



