import java.util.Scanner; 
class ternary2
{
	public static void main(String args[]) 
	{ 
	
		int x , y ,max; 
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 2 numbers ");
		x = scan.nextInt();
		y = scan.nextInt();
		max = (x > y) ? x : y; 
		System.out.println("Largest number between " + x + " and " + y + " is " + max + ". " ); 
	} 
}
