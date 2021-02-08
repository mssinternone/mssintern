package ControlStatementsandArrays;
import java.util.Scanner; 
public class SumAlgebraTwo {
	
	 
	public static void main(String...args) { 
	Scanner in=new Scanner(System.in); 
	System.out.println("Enter x : ");
	int x=in.nextInt(); 
	System.out.println("Enter n : "); 
	int no=in.nextInt();
	int fact=1; 
	float sum=1;
	for(int i=1;i<=no;i++) { 
	fact=1; 
	for(int j=i;j>1;j--) { 
	fact=fact*j; 
	sum=sum+ (float)Math.pow(x, i)/(float)fact; 
	System.out.println("Result :"+sum); 

}
}
	}}