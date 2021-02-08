package ControlStatementsandArrays;
import java.util.Scanner; 
public class PerfectNum {

	 public static void main(String[] args) { 
	 
		 Scanner sc=new Scanner(System.in);
	     System.out.println("Enter a Number :");
	     int no = sc.nextInt(); 
	     int sum=0;
	     for(int i=1;i<no;i++)
	     { 
	    	 if(no%i==0) 
	    	 { 
	    		 sum+=i; 
	    	 }
	     }
	
	 if(sum==no)
	 { 
	 System.out.println("The number is Perfect Number");
	 }
	 else
	 { 
	 System.out.println("The number is not a Perfect Number"); 
	 }
	 }
	}
