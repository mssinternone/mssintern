package javafun;
import java.util.Scanner;
public class Bternary {
 
       public static void main(String args[]) {
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("enter three numbers:");
    	   int a=sc.nextInt();
    	   int b=sc.nextInt();
    	   int c=sc.nextInt();
    	   System.out.println((a>b && a>c) ? a:((b>a && b>c) ? b:c)+ " is biggest");
       }
}
