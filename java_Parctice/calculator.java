package java_Parctice;
import java.util.Scanner;

public class calculator {
	public static void main(String[] args)
	{
		Scanner ob = new Scanner(System.in);
		Boolean flag = true;
		
		do
		{
					
				System.out.println("Enter your choice \n 1.Addition \n 2.Substraction \n 3.Multiplication \n 4.Division\n 5.Exit");
				
				int x = ob.nextInt();
				if(x == 5)
				{
					break;
				}
				System.out.println("Enter 2 numbers");
				int num1 = ob.nextInt();
				int num2 = ob.nextInt();
					
				switch(x)
				{
				case 1: 	
					System.out.println(num1 + num2);
						break;
				
				case 2: 
					System.out.println(num1 - num2);
						break;
				
				case 3:
					System.out.println(num2 * num1);
						break;
				
				case 4 : 
					System.out.println(num1/num2);
						break;
			
				default : 
					System.out.println("Enter valid input");
				
				}
			}while(flag);
	}
}
