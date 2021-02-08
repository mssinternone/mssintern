
import java.util.Scanner;
class even_odd
{
  public static void main(String args[])
  {
    int num;
    System.out.println("Enter a positive number:");
    Scanner input = new Scanner(System.in);
    num = input.nextInt();
    if ( num % 2 == 0 )
        System.out.println("number is even");
     else
        System.out.println("number is odd");
  }
}

