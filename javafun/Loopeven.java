package javafun;
import java.util.Scanner;
public class Loopeven {
  
	public static void main(String[] args) {
    
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter a number");
		n=sc.nextInt();
		System.out.println("even numbers using for loop");
		for(int i=1;i<=n;i++) {
			 if(i%2==0) {
				 System.out.println(i);
			 }
		}
		System.out.println("even numbers using while loop");
		int j=1;
		while(j<=n) {
			 if(j%2==0) {
				 System.out.println(j);
			 }
			 j++;
		}
		System.out.println("even numbers using do while loop");
		int k=1;
		do {
			k++;
		 if(k%2==0) {
			 System.out.println(k);
		 }
	   }while(k<n);

		float c= 1/8.0f;
		System.out.println(c);
	
}
}