package javafun;
import java.util.Scanner;
public class Xyplane {
       public static void main(String args[]) {
    	   Scanner sc=new Scanner(System.in);
    	   int x,y,n;
    	   System.out.println("enter x value:");
    	   x=sc.nextInt();
    	   System.out.println("enter y value:");
    	   y=sc.nextInt();
    	   if(x==0 && y==0) {
    		   System.out.println("it lies on Origin");
    	   }
    	   else if(x==0 && y!=0) {
    		   System.out.println("it lies on Y- axis");
    		   
    	   }
    	   else if(x!=0 && y==0) {
    		   System.out.println("it lies on X - axis");
    	   }
    	   else {
    		   System.out.println("it lies on XY -plane");
    	   }
    	   
       }
}
