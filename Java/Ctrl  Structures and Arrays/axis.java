import java.util.Scanner;
public class axis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the points X and Y");
		x = scan.nextInt();
		y = scan.nextInt();
		if(x==0 && y==0)
		{
			System.out.println("Point lies on origin");
		}
		else
		{
			System.out.println("Point does not lies on origin");
		}
	}

}
