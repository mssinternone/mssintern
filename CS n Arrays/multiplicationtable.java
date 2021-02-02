package projects;
import java.util.Scanner;
public class multiplicationtable {

	public static void main(String[] args) {
		 System.out.println("Enter an integer variable :: ");
	      Scanner sc = new Scanner(System.in);
	      int num = sc.nextInt();
	      for(int i=1; i<= 20; i++) {
	         System.out.println(""+num+" X "+i+" = "+(num*i));
	      }
	   }
	

	}


