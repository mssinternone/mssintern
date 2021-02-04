package java_Parctice;

public class Fibonacci {
public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=0;
		System.out.printf(a+" "+b+" ");
		for(int i=0;i<5;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.printf("%d ",c);
		}
	}

}

