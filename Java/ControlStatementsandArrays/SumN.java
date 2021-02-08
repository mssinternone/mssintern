package ControlStatementsandArrays;
import java.util.Scanner; 
public class SumN {
	
	
	public static void main(String[] args) { 
	Scanner in=new Scanner(System.in);
	int sum=0; 
	System.out.println("Enter n :");
	int no=in.nextInt(); 
	for(int i=0;i<=no;i=i+2) { 
	sum=sum+i; 
	System.out.println("Sum of even "+no+" is : "+sum); 

}
}
}