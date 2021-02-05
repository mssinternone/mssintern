import java.util.Scanner;
public class multiplicationtable {

    public static void main(String[] args) {
    	System.out.println("enter a number to find multiplication table:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
}