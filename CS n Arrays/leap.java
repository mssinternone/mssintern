import java.util.Scanner;
public class leap{
    public static void main(String[] args) {
    	int year;
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter Year:");
    	year = scan.nextInt();
    	scan.close();
        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                	System.out.println(year + " is a Leap Year.");
                else
                	System.out.println(year + " is not a Leap Year.");
            }
            else
            	System.out.println(year + " is a Leap Year.");
        }
        else {
        	System.out.println(year + " is not a Leap Year.");
        }
    }
}
