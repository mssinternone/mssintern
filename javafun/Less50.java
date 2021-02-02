package javafun;
import java.util.Scanner;
public class Less50 {
    
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n;
		System.out.println("enter a number");
		n=sc.nextInt();
		int i=0,s=0;
		while(i<n) {
              		if(s<50) {
              			 s=s+i;
              			 i++;
              		}
              		else {
              			break;
              		}
              		System.out.println(s);
		}
              		
		
	}
	
}
