import java.util.Scanner;
public class even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	num = sc.nextInt();
	for (i=0;i<num;i++)
	{
		if(i%2 == 0)
		{
			System.out.println("The even numbers are :" +i);
		}
	}
	}

}
