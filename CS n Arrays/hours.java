package projects;
import java.util.Scanner;
public class hours {

	public static void main(String[] args) {
		System.out.println("enter the time in hours::");
		int sec;
		Scanner obj=new Scanner(System.in);
		int hrs=obj.nextInt();
		sec=hrs*3600;
		System.out.println("time in seconds are \n"+sec);
	}

}

