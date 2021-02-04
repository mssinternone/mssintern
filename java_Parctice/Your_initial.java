package java_Parctice;
import java.util.Scanner;

	public class Your_initial {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("enter your initial");
			char YourFirstInitial= scan.next().charAt(0);
			
			System.out.println(YourFirstInitial);
			scan.close();
			}
		}



