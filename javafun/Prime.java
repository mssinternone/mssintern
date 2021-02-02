package javafun;
import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		int i =0;
	       int num =0;
	       int[] primes = new int[10];
	       for (i = 1; i <= 10; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		    primes[i]=i;
		  }	
	       }	
	       System.out.println("Prime numbers from 1 to 10 are :");
	       for(int i2=0;i2<10;i2++) {
	    	   if(primes[i2]!=0)
	    	   System.out.println(primes[i2]);
	       }
	}
}

