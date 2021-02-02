package projects;
import java.util.Scanner;
public class pattern2 {

	public static void main(String[] args) {
	Scanner obj=new Scanner (System.in);
	int n=obj.nextInt();
	int space=n;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<space ;j++) {
			System.out.print(" ");
		}
		if(i==1) {
			System.out.print(" "+i);
		}
		else {
			int num=(int)Math.pow(11,i);
			int num1=0;
			
			while(num>0) {
				int r=num%10;
				num1=num1*10+r;
				num=num/10;
			}
			while(num1>0) {
				int r=num1%10;
				System.out.print(r+" ");
				num1=num1/10;
			}
			
		}
		System.out.println();
		space--;
	}
}

	}


