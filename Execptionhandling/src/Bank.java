import java.util.*;
class MyException extends Exception 
{ 
	public MyException(String s) {
		super(s);
	} 
} 
public class Bank {

	public static void main(String[] args) {
		int accbal =10000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount to withdraw");
		int wd =sc.nextInt();
		
		try {
			if(wd<=accbal) {
				System.out.println("Withdrawn Amount is"+wd);
				accbal=accbal-wd;
				System.out.println("Acc Bal="+accbal);
			}
			else {
				throw new MyException("Invalid Amount");
			}
		}
		catch(MyException m) {
			System.out.println("Caught"); 
			System.out.println(m.getMessage());
		}
	}

}
