import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a,b,c,d;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter three numbers");
	a = scan.nextInt();
	b =scan.nextInt();
	c =scan.nextInt();
	d = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
	System.out.println(d+" Biggest number");
	}

}


