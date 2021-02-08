import java.util.Scanner; 
class ternary3
{
	public static void main(String args[]) 
	{ 
	
		int x , y ,z ,max; 
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 3 numbers ");
		x = scan.nextInt();
		y = scan.nextInt();
		z = scan.nextInt();
		max = (x > y) ? (x > z ? x : z) : (y > z ? y : z);
		System.out.println("Largest number among " + x +  ", " + y + " and " + z + " is " + max + ". " ); 
	} 
}
