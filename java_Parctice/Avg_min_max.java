package java_Parctice;

import java.util.Scanner;
public class Avg_min_max {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] numb = new int[20];
		System.out.println("enter 10 numbers");
		for(int i=0;i<10;i++) {
			
			numb[i] = scan.nextInt();
		}
		int avg=0,max=numb[0],min=numb[0];
		for(int i=0;i<10;i++) {
			avg=avg + numb[i];
			if(min>numb[i]) {
				min=numb[i];
			}
			if(max<numb[i]) {
				max=numb[i];
			}
		}
		avg/=10;
		System.out.println("\naverage is:-"+avg+"\n min:-"+min+" \nmax:-"+max);
	}
}
