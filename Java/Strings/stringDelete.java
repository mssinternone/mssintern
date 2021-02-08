import java.util.Scanner;
public class stringDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string :");
	String name = sc.nextLine();
	System.out.println("Enter a character to remove :");
	char remove =sc.next().charAt(0);
	String rename = name.replace(remove,' ');
	
	System.out.println("After deletion: " + rename);
}

}