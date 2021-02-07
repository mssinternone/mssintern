import java.util.Scanner;
public class Comwords {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter string");
		String s1=scan.nextLine();
		String[] s3=s1.split(" ");
		System.out.println("enter string");
		String s2=scan.nextLine();
		String[] s4=s2.split(" ");
		for(int i=0;i<s3.length;i++) {
			for(int j=0;j<s4.length;j++) {		
				int c=s3[i].compareTo(s4[j]);
				if(c==0) {					
					System.out.print(s3[i]+" ");
				}
			}
		}
	}
}