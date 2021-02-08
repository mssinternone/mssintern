import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int input =0,z =0,x,y;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your choice");
	System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Exit");
	input = sc.nextInt();
	System.out.println("Enter two numbers");
	x = sc.nextInt();
	y = sc.nextInt();
	switch(input)
	{
		case 1:	z=x+y;
			System.out.println("Addition ="+z);
			break;
		case 2:	z=x-y;
			System.out.println("Substraction ="+z);
			break;
		case 3:	z=x*y;
			System.out.println("Multiplication ="+z);
			break;
		case 4:	z=x/y;
			System.out.println("Divison ="+z);
			break;
		default:	
			System.out.println("Invalid choice");
		
	}
	
	}

}
