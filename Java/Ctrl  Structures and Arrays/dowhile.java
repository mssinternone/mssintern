import java.util.Scanner;
public class dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		num = sc.nextInt();
		int i=0;
		i=1;
	    do
	    {
	        
	        if(i%2==0)
	        {
	            System.out.println(i);
	        }

	        i++;
	    }while(i<=num);
	}

}
