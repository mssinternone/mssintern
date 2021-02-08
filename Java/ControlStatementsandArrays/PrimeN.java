package ControlStatementsandArrays;
import java.util.Scanner; 
public class PrimeN {
	
	
	public static void main(String[] args) { 
		int i;
	int count=0; 
	for( i=1;i<= 10;i++) { 
	count=0; 
	for(int j=1;j<=10;j++){ 
	if(i%j==0) { 
	count++; 
	}
	}
	
	if(count==2||count==1) { 
	System.out.printf("%d ",i); 
	}
}
}}