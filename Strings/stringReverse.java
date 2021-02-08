import java.util.Scanner;

public class stringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String name = sc.nextLine();
		char[] rev = name.toCharArray();
		for(int i=name.length()-1;i>=0;i--)
		{
			System.out.print(rev[i]);
		}
	}

}
