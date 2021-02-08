import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n,i,r,sum=0,temp=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	n = sc.nextInt();
	temp =n;
	for (i = 0;i<=n;i++)
	{
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
	}
	if(temp==sum)
	{
		System.out.println("Palindrome number");
	}
	else
	{
		System.out.println("Not palindrome");
	}
	}

}
