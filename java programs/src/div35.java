import java.util.Scanner;
public class div35 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int number;
        System.out.println("enter a number:");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
		if((number % 3 == 0) && (number % 5 == 0))
		{
			System.out.println("\n Given number " + number + " is Divisible by 3 and 5"); 
		}
		else
		{
			System.out.println("\n Given number " + number + " is Not Divisible by 3 and 5"); 
		}
   

    }   
}