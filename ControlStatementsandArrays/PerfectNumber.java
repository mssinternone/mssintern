package ControlStatementsandArrays;
import java.util.Scanner; 
public class PerfectNumber {
	
	
	 public static void main(String[] args) { 
	 Scanner in=new Scanner(System.in); 
	 System.out.println("Enter a Number :");
	 int no=in.nextInt();
	 int sum=0;
	 for(int i=1;i<no;i++) {
		 if(no%i==0) { 
	 }
	 sum+=i; 
	 }
	 if(sum==no) { 
	 System.out.println("The number is Perfect Number"); }
	 else{ 
	 System.out.println("The number is not a Perfect Number"); 
	 }
}
}