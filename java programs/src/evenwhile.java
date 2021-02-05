import java.util.Scanner;
public class evenwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,i=2;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();	
		while(i<=number)
	        {
				if(i%2==0) {
					System.out.println(i+" this is even");
				}
	          i++;
	        }	
			
	}

}
