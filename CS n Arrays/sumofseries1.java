package projects;
import java.util.Scanner;

public class sumofseries1 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a number");
		int n=obj.nextInt();
		float sum=1;
		for(int i=1;i<=n;i++) {
			sum=sum+(1.0f/(int)Math.pow(2, i));
		}
		System.out.println(sum);
			
		

	}

}
