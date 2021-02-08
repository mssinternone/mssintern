import java.util.Scanner;
public class sumLessThanFive {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 System.out.println("enter n to find sum upto n");
		 int n=scan.nextInt();
		 int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;				
		}
		if(sum>50)
		System.out.println(sum+" is greater than 50");
		else
			System.out.println(sum);
	}
}

