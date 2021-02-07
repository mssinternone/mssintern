import java.util.Scanner;
public class Removecommon {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter string one");
		String s1=scan.nextLine();
		System.out.println("enter string two");
		String s2=scan.nextLine();
		char[] w1=s1.toCharArray();
		char[] w2=s2.toCharArray();
		for(int i=0;i<w1.length;i++) {
			for(int j=0;j<w2.length;j++) {
				if(w1[i]==w2[j]) {
					w1[i]=' ';
					w2[i]=' ';
				}
			}
		}
		s1=new String(w1);
		System.out.println(s1);
		s2=new String(w2);
		System.out.println(s2);
	}
}
