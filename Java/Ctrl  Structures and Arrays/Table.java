import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n,i=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number:");
	n = sc.nextInt();
	for (i =1;i<=10;i++)
	{
		System.out.printf("%d*%d = %d\n",n,i,n*i);
	}
	}

}
