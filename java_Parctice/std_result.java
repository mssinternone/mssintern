package java_Parctice;

import java.util.Scanner;

public class std_result {
	public static void main(String[] args)
	{
		int min=50, marks;
		Scanner sc = new Scanner(System.in);
		marks = sc.nextInt();
		
		if(marks >= min)
		{
			System.out.println("Passed");
			if(marks > 90)
			{
				System.out.println("A grade");
			}
			else if(marks>70 && marks<90)
			{
				System.out.println("Grade B");
			}
			else if(marks>60 && marks<70)
			{
				System.out.println("Grade C");
			}
			else
			{
				System.out.println("Grade D");
			}
		}
		else
		{
			System.out.println("Failed");
		}
		
		
	}

}
