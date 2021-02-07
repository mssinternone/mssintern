import java.util.Scanner;
public class Elesplchar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter string");
		String s1=scan.nextLine();
		System.out.println("Char removed");
		for(int i=0;i<s1.length();i++) {
			if((s1.charAt(i)>='a'&& s1.charAt(i)<='z')||((s1.charAt(i)>='A'&& s1.charAt(i)<='Z'))||(s1.charAt(i)==' ')){
				System.out.print(s1.charAt(i));
			}
		}
	}
}
