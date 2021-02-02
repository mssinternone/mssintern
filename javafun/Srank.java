package javafun;
import java.util.Scanner;
public class Srank {

	public static void main(String args[]) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a marks of student:");
		n=sc.nextInt();
		if(n>35) {
			if(n>=90 && n<100) {
				System.out.println("He got passed...and he got grade : O ");
			}
			else if(n<90 && n>=80){
				System.out.println("he got passsed....and he got grade: A");
			}
			else if(n<80 && n>=70) {
				System.out.println("he got passed ... and he got grade: B");
			}
			else if(n<70 && n>=60){
				System.out.println("he got passed ... and he got grade: C");
			}
			else {
				System.out.println("he got passed ... and he got grade: D");
			}
			
		}
		else {
			System.out.println("he failed !!!...");
		}
        		
		
		
	}
	
	
}
