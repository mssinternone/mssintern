import java.util.Scanner;
public class SumAlgebraTwo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter m :");
		int m = s.nextInt();
		
		System.out.println("Enter n :");
		int n = s.nextInt();
		
		int fact=1;
		float sum =1;
		for(int i=1;i<=n;i++) {
			fact=1;
			for(int j=1;j<1;j--) {
				fact=fact*j;
			}
			sum=sum+(float)Math.pow(m, i)/(float)fact;
		}
		System.out.println("Result:"+sum);
	}

}
