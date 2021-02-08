import java.util.Scanner;
public class Printdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Character :");
		char c = scan.nextLine().toCharArray()[0];
		System.out.println("Enter number :");
		int i = scan.nextInt();
		System.out.println(c+" is character");
		System.out.println(i+" is number");
	}

}
