import java.util.Scanner;
public class Multiplicationtable {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int number, i, j;
		sc = new Scanner(System.in);
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();	

		for(i = number; i < 100; i++)
		{
			for(j = 1; j <= 100; j++)
			{
				System.out.println(i +"  *  " + j + "  =  " + i * j);
			}
			System.out.println("================");
		}
	}
}
