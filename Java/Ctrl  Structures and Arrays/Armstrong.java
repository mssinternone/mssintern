import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int c=0,n,a,temp; 
		 	Scanner sc = new Scanner(System.in);
		 	System.out.println("Enter a number to check armstrong ao not");
		 	n=sc.nextInt();//It is the number to check armstrong  
		    temp=n;  
		    while(n>0)  
		    {  
		    a=n%10;  
		    n=n/10;  
		    c=c+(a*a*a);  
		    }  
		    if(temp==c)  
		    System.out.println("armstrong number");   
		    else  
		        System.out.println("Not armstrong number"); 

	}

}
