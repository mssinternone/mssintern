import java.util.Scanner;
public class Comcharacter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter string one");
		String s1=scan.nextLine();
		System.out.println("enter string two");
		String s2=scan.nextLine();
		String s3 = "";
		char[] w1=s1.toCharArray();
		char[] w2=s2.toCharArray();
		for(int i=0;i<w1.length;i++) {
			for(int j=0;j<w2.length;j++) {
				if(w1[i]==w2[j]) {
					if (s3.indexOf(w1[i]) == -1) {
					    s3=s3+w2[i]+" ";
					}
				}
			}
		}
		System.out.println(s3 + " are common characters in both Strings");
	}
}