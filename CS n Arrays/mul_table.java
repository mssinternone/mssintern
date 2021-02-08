import java.util.Scanner;
public class mul_table {

    public static void main(String[] args) {

    	int x ; 
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number to print table ");
		x = scan.nextInt();
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", x, i, x * i);
        }
    }
}