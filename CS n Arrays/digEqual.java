import java.util.Scanner;
public class digEqual {
	public static void main(String[] args) {
		int count=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number of numbers you  want to enter");
		int c= scan.nextInt();
				int[] numb = new int[c];
				
				for(int i=0;i<c;i++) {
					System.out.println("enter number "+(i+1)+" ");
					numb[i] = scan.nextInt();
				}
			int	check=numb[0];
				for(int i=0;i<c;i++) {
					if(numb[i]==check)
						count++;
			}
				if(count==c)
				System.out.println("equal");
				else
					System.out.println("not");
	}
}
