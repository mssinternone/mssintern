import java.util.Scanner;
public class digToWord{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a digit");
		int n = s.nextInt();
		
		String[] dig_word = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		int rev = 0;
		
		while(n!=0) {
			rev= rev * 10 +(n%10);
			n=n/10;
	
		}
		while (rev!=0) {
			System.out.printf("%s",dig_word[rev%10]);
			rev=rev/10;
		}
	}

}
