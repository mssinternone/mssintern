import java.util.Scanner;
class UserException extends Exception{
	UserException(){
		System.out.println("The entered amount must be less than 10000/-");
	}
}
public class BankDetails {

	public static void main(String[] args)throws UserException{
		// TODO Auto-generated method stub
		
			int count =0;
			while(count<3)
			{
				String name = "hema";
				int password =1234;
				System.out.println("Enter your name: ");
				Scanner sc = new Scanner(System.in);
				String name1 = sc.nextLine();
				System.out.println("Enter your password:");
				int password1 = sc.nextInt();
			
				if(name.equals(name1) && password==password1)
				{
					System.out.println("~~~~Successfully login~~~~");
					break;
				}
				
				else
				{	if(count<2) {
					System.out.println("Please login again..");
					}
					
					else if(count ==2) {
						System.out.println("No more chances for you");
						System.exit(1);
					}
					count =count+1;
				}

			}
		
				while(true) {
					
					System.out.println("Select anyone option (1)Withdraw (2)Deposit (3)Showbalance (4)Exit");
					Scanner sc =new Scanner(System.in);
					int opt =sc.nextInt();
					int amount =10000;
					switch(opt)
					{
						case 1:
							System.out.println("Enter amount to withdraw: ");
							int withdraw = sc.nextInt();
							try {
								if (withdraw >=amount)
									throw new UserException();	
							}
							catch(Exception e) {
								System.out.println(e);
							}
								break;
							case 2:
								System.out.println("Enter your amount to deposit");
								int deposite = sc.nextInt();
								int total = deposite + amount;
								System.out.println("After deposit the amount is: "+total);
								break;
							case 3:
								System.out.println("The total amount is :"+amount);
								break;
							case 4:
								System.out.println("You are loged out");
								System.exit(0);
							}			
					
			
							}
					}
	
			}
	
		
	

	

