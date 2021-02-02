package javaintern;
import java.util.Scanner;
public class fibonacci 
{
	public static void main(String args[])  
	{    
	 int n1=0,n2=1,n3,i,count=0;  
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter number");
	 count=sc.nextInt();
	 System.out.print(n1+" "+n2); 


	    
	 for(i=2;i<count;++i)    
	 {    
	  n3=n1+n2;    
	  System.out.print(" "+n3);    
	  n1=n2;    
	  n2=n3;    
	 }    
	  
	}
}
