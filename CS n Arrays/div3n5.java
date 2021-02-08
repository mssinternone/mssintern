import java.util.Scanner;
public class div3n5 {
	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
    	System.out.println("Enter any number to check whether it is divisible by 3 n 5:");
    	num = scan.nextInt();
    	scan.close();
    	if(num % 3 == 0 && num % 5 == 0)
    		System.out.println("It is divisible by 3 n 5");
    	else
    		System.out.println("It is not divisible by 3 n 5");
	}
}
