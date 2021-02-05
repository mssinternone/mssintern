import java.util.Scanner;

public class evendowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		
		Scanner sc = new Scanner(System.in);
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();
		
		
		
		
		int w=1;
		do {
		    w++;
		    if(w % 2==0) 
		       
		     System.out.println("Even: " + w);
		} while (w <= number);	
		
		
		
		
		
	}

}
