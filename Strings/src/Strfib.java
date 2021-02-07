import java.util.*;
public class Strfib {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter string");
		String s1=scan.nextLine();
		
		int flag=0,i=0;
		int j=s1.length()-1;
		while(i<=j) {
			if(s1.charAt(i)!=s1.charAt(j)) {
				flag=1;
				break;
			}
			i++;
			j--;
		}
		if(flag==0) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}
}
