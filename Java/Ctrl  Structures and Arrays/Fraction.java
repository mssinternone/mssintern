import java.util.Scanner;
public class Fraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	float i,count =0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number:");
	float n = sc.nextFloat();
	for(i=1;i<=n;i++)
	{
		count+=1/i;
	}
	System.out.println(count);
}

}
