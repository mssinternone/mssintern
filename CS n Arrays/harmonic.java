import java.util.Scanner;
public class harmonic{
	public static void main(String...args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter n :");
		int n = s.nextInt();
		float sum=0;
		for(int i=0;i<=n;i++) {
			sum = sum+((float)1/(float)i);
		}
		System.out.println("Result:"+sum);
	}
}

