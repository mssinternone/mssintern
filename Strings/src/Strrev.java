import java.util.Scanner;
public class Strrev {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter string");
		String s1=scan.nextLine();
		for(int i=s1.length()-1;i>=0;i--) {
			System.out.printf("%c",s1.charAt(i));
		}
	}
}

