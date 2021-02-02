package projects;
import java.util.Scanner;
public class equalornot {

	public static void main(String[] args) {
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of numbers you  want to enter");
		int c= sc.nextInt();
				int[] n = new int[c];
				
				for(int i=0;i<c;i++) {
					System.out.println("enter number "+(i+1)+" ");
					n[i] = sc.nextInt();
				}
			int	check=n[0];
				for(int i=0;i<c;i++) {
					if(n[i]==check)
						count++;
			}
				if(count==c)
				System.out.println("equal");
				else
					System.out.println("not");
	}

	}


