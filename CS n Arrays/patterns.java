import java.util.Scanner;
public class patterns {
	public static void main(String[] args) {
		int sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number of rows you  want to enter");
		int n= scan.nextInt();
		for(int i=0;i<n;i++) {
			System.out.printf("\n");
				for(int j=1;j<n-i;j++) {
					System.out.printf(" ");
				}
				if(i==0) {
					System.out.printf(" 1");
				}else {
					int no=(int)Math.pow(11,i+1);
					while(no!=0) {
						System.out.printf("%d ",no%10);
						no=no/10;
					}
				}
		}
	}
}
