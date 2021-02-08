import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i,j,n,coef=1,space;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the no of lines");
		 n=sc.nextInt();
		 for(i=0;i<n;i++)
		 {
		 
		    for(space=1;space<=n-i;space++)
		    {
		    	System.out.print("  ");
		    } 
		    for(j=0;j<=i;j++)
		    {
		    	if(j==0 || i==0)
		    		coef=1;
		         else
		        	 coef = coef*(i-j+1)/j;
		 
		    		System.out.printf("%4d",coef);
		    }
		 
		         System.out.println();
		     }
	}

}
