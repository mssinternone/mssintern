import java.util.Scanner;
public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, count =0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number : ");
		n = sc.nextInt();
		while(n!=0)
		{
			n = n/10;
			count = count+1;
		}
		n = n+1;
		System.out.println("The numbers are "+count);
	}

}
