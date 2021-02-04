package java_Parctice;
import java.util.Scanner;

	public class Big_digit {
		public static void main(String[] args) {
			
					Scanner scan = new Scanner(System.in);
					System.out.println("enter number to find the largest number");
					int n = scan.nextInt();
					int[] lst1 = new int[20];
					
					int rev=0;
					int i=0;
					while(n>0) {
				     	rev=n%10;
				     	lst1[i]=rev;
				     	i++;
				     	n=n/10;
					}
					int big=0;
					for(i=0;i<lst1.length;i++) {
						if(lst1[i]>big) {
							big=lst1[i];
						}
					}
					System.out.println(big);
		}
	}



