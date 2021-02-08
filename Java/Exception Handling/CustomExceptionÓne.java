import java.util.Scanner;

class UserException extends Exception{
	UserException(){
		System.out.println("The entered amount must be less than 10000/-");
	}
}

public class CustomExceptionÓne {
	public static void main(String[] args) throws UserException
	{
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your amount: ");
	int number = sc.nextInt();
	int amount =10000;
	try {
		if (number>=amount)
			throw new UserException();	
	}catch(Exception e) {
		System.out.println(e);
	}
	
	finally {
		System.out.println("Out of the block");
	}

	}
}
