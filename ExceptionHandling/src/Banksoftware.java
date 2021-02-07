import java.util.Scanner;


class MyException1 extends Exception {


	MyException1()
	{

		System.out.println("mismatch");
	}

}

public class Banksoftware {

	public static void main(String args[]) {
		int psswd;
		String name;
		System.out.println("Enter account name:");
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		System.out.println("Enter account password:");
		psswd = sc.nextInt();
		try {
			if (name.equals("oye"))
			{
				System.out.println("name valid");
			} 
			else {
                     System.out.println("hii rajesh");
				throw new MyException1();
				
			}
		} 
		catch (MyException1 e) {
			System.out.println("ho");
		}
	}

}
