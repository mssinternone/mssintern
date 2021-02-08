import java.util.Scanner;
public class harmonicSquare {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n :");
		int n = s.nextInt();
		
		float sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+(float)1/(float)Math.pow(2, i);
		}
		System.out.println("Result:"+sum);
	}

}
