import java.util.Scanner;
public class strLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String name = sc.nextLine();
		int count=0;
		for(int i = 0;i<name.length();i++)
		{
			count = count+1;
		}
		System.out.println(count);
	}

}
