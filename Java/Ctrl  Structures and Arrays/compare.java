import java.util.Scanner;
public class compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int x,y;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter two numbers:");
	x = scan.nextInt();
	y = scan.nextInt();
	System.out.println((x==y)?x+" equal "+y:x+" not equal to "+y);
	
	}

}
