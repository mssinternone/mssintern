package javafun;
import java.util.Scanner;
public class Div3and5 {
 
  public static void main(String args[]) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter a number..");
	  int n=sc.nextInt();
      if((n%3==0) && (n%5==0)) {	  
    	  System.out.println(n+"\tis divisible by both 3 and 5");
      }else {
    	  System.out.println("it is not divisible by both 3 and 5");
      }
  }
}
