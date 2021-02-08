import java.io.*;
import java.util.Scanner; 

class xyaxis { 
	static void quad(int x, int y) 
	{ 
		if (x > 0 && y > 0) 
			System.out.println("lies in First quadrant"); 
		else if (x < 0 && y > 0) 
			System.out.println("lies in Second quadrant"); 
		else if (x < 0 && y < 0) 
			System.out.println("lies in Third quadrant"); 
		else if (x > 0 && y < 0) 
			System.out.println("lies in Fourth quadrant"); 
		else if (x == 0 && y > 0) 
			System.out.println("lies at positive y axis"); 
		else if (x == 0 && y < 0) 
			System.out.println("lies at negative y axis"); 
		else if (y == 0 && x < 0) 
			System.out.println("lies at negative x axis"); 
		else if (y == 0 && x > 0) 
			System.out.println("lies at positive x axis"); 
		else
			System.out.println("lies at origin"); 
	} 	
public static void main(String[] args) 
	{ 
		int x , y; 
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the cordinates to check:");
		x = scan.nextInt();
		y = scan.nextInt();
		quad(x, y); 
	} 
} 
