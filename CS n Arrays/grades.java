import java.util.Scanner;
public class grades {
	public static void main(String[] args) {
	int num;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter ur marks");
	num = scan.nextInt();
	scan.close();
		if(num >= 80){
			System.out.println(" You got A grade");
			}
		else if ( num >=60){ 
			System.out.println(" You got B grade");
			}
		else if ( num >=40){
			System.out.println(" You got C grade");
			}
		else {
			System.out.println(" You Failed in this exam");
			}
	}
}
