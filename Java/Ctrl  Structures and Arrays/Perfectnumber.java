import java.util.Scanner;
public class Perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number : ");
		n = sc.nextInt();
		for (i=1;i<n;i++)
		{
			if(n%i == 0)
			{
				count = count+i;
			}
			
		}
		System.out.println(count);
		if(count==n) {
			System.out.println("Perfect number!!!");
		}
		else {
			System.out.println("~~~Not a perfect number~~");
		}
		

	}

}
