import java.util.Scanner;
public class Seriespattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n,i;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to print series");
	n = sc.nextInt();
	for (i=1;i<=n;i++)
	{
		System.out.printf(i+"x^/"+i+"!+\t");
	}
	
	}

}
