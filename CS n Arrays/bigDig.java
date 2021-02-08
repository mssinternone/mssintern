import java.util.Scanner;
public class bigDig {
	public static void main(String[] args) {
		
				Scanner scan = new Scanner(System.in);
				System.out.println("enter number to find no of digits");
				int n = scan.nextInt();
				int[] numb = new int[20];
				
				int rev=0;
				int i=0;
				while(n>0) {
			     	rev=n%10;
			     	numb[i]=rev;
			     	i++;
			     	n=n/10;
				}
				int big=0;
				for(i=0;i<numb.length;i++) {
					if(numb[i]>big) {
						big=numb[i];
					}
				}
				System.out.println(big);
	}
}
