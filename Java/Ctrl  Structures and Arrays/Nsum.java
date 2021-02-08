import java.util.Scanner;
public class Nsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		 System.out.println("enter a number= ");
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
