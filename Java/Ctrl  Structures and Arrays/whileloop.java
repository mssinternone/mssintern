import java.util.Scanner;
public class whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		num = sc.nextInt();
		int i=0;
		i=1;
	    while(i<=num)
	    {
	        
	        if(i%2==0)
	        {
	            System.out.println(i);
	        }

	        i++;
	    }
		
		
	}

}
