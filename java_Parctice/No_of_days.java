package java_Parctice;
import java.util.Scanner;

public class No_of_days {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("Enter the month number: \n1.January\n2.February\n3.March\n4.April\n5.May\n6.June\n7.July\n8.August\n9.September\n10.October\n11.November\n12.December");
			int num = sc.nextInt();
			if(num >0 && num < 13 )
			{
				switch(num)
				{
				
				case 1: System.out.println("31 days");
						break;
				
				case 2: System.out.println("28 days");
						break;

				case 3: System.out.println("30 days");
						break;
				
				case 4: System.out.println("31 days");
						break;
				
				case 5: System.out.println("30 days");
						break;

				case 6: System.out.println("31 days");
						break;

				case 7: System.out.println("30 days");
						break;

				case 8: System.out.println("31 days");
						break;

				case 9: System.out.println("30 days");
						break;
						
				case 10: System.out.println("31 days");
						 break;

				case 11: System.out.println("30 days");
							break;
							
				case 12: System.out.println("31 days");
							break;
							
				default:
					System.out.println("Enter a valid option");

				
				}
			}
		}while(true);
		
		
		
		
	}

}
