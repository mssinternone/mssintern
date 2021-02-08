import java.util.Scanner;
public class Dowhiletable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
		int n,i=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		n = sc.nextInt();
		do
		{
			System.out.printf("%d*%d = %d\n",n,i,n*i);
			i = i+1;
		}while(i<=10);
		}
	

}
