package ControlStatementsandArrays;
import java.util.Scanner;
public class studentresult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a your total to calcalate  your rank:");
		int total=sc.nextInt();
		if(total>35) {
			System.out.println("passed");
		
				if(total>=80)
				{
					System.out.println(total+"  you got 1st rank");
				}
				else if(total >=60 && total<80)
				{
					System.out.println(total+" you got 2nd rank");
				}
				else if(total>=40 && total<50)
				{
					System.out.println(total +" you got 3rd rank");
				}
				else
				{
					System.out.println( total +" you got average marks");
				}
		}
		else
		{
			System.out.println("failed");
		}
	}

}
