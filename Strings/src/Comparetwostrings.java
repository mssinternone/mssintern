import java.util.Scanner;
class Comparetwostrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String s1=sc.nextLine();
		System.out.println("enter string");
		String s2=sc.nextLine();
		int temp=0;
		if(s1.length()==s2.length()) {
			for(int i=0;i<=s1.length()-1;i++) {
				if(s1.charAt(i)==s2.charAt(i)) {
					temp+=1;
				}
			}
			if(temp==s1.length()) {
				System.out.println("same");
			}else {
				System.out.println("not same");
			}
	    }else
	    	System.out.println("not same");
 }
}
