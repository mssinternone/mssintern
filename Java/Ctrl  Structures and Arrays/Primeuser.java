import java.util.Scanner;
public class Primeuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i,m=0,flag=0;   
		 Scanner scan = new Scanner(System.in);
			System.out.println("enter a number= ");
			int n= scan.nextInt();
		  m=n/2;      
		    
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(n+" is prime number"); }  

		
		  }
	
}


