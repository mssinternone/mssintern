package projects;
import java.util.Scanner;
public class firstandlast {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int sum=0;
		int i=1;
		int r=0;
		while(n>0) {
			 r=n%10;
			if(i==1) {
				sum=sum+r;
				i=0;
			}
			
			n=n/10;
		}
		sum=sum+r;
		System.out.print(sum);
	}

	}


