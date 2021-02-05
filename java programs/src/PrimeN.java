import java.util.Scanner;

public class PrimeN {
	public static void main(String[] args) {
		int count = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = in.nextInt();
		for (int i = 1; i <= n; i++) {
			count = 0;
			for (int j = 1; j <= n; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2||count==1) {
				System.out.println(i);
			}
		}
	}
}
