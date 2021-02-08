import java.util.Scanner;

public class sumsquares {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	float i,count =0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number:");
	float n = sc.nextFloat();
	for(i=1;i<=n;i++)
	{
		count+=1/Math.pow(2,i);
	}
	System.out.println(count);
}

}
