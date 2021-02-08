import java.util.Scanner;
public class Evensum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n,i,sum=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	n = sc.nextInt();
	for(i=0;i<=n;i++)
	{
		if(i%2==0)
		{
			sum= sum+i;
		}
	}
	System.out.println("The sum of even numbers :"+sum);
		
	}

}
