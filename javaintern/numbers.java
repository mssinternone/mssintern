package javaintern;
import java.util.Scanner;
public class numbers
{

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int count = 0;
    System.out.println("Enter a number ::");
    int num = sc.nextInt();
    while(num!=0){
       num = num/10;
       count++;
    }
    System.out.println("Number of digits in the entered integer are :: "+count);
 }
}