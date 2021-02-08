package ExceptionHandling;

import java.util.*;

class CusException extends Exception{

	public CusException(String s)

	{
		super(s);

     }
 }

   public class ExcepProject {
      int accbal=10000;
      void withdraw()
      {
    	  System.out.println("enter amount to withdraw");
    	  Scanner sc = new Scanner(System.in);
    	  int wd=sc.nextInt();
    	  try {
    		  if(wd>accbal) {
    			  throw new CusException("Insufficient money");
    		  }
    		  else {
    			  accbal=accbal-wd;
    			  System.out.println("withdrawl completed");
    		  }
    	  }
    	  catch(CusException e){
    		  System.out.println(e);
    	  }
      }

      void deposite()
      {
    	  System.out.println("enter amount to deposit : ");
    	  Scanner sc = new Scanner(System.in);
    	  int dep=sc.nextInt();
    	  try {
    		  if(dep<500)
    		  {
    			  throw new CusException("Deposit must be greater than 500");
    		  }
    		  else {
    			  accbal = accbal+dep;
    			  System.out.println("Deposit successfull..");
    		  }
    	  }
    	  catch(CusException d)
    	  {
    		  System.out.println(d);
    	  }
      }

      void checkbal()
      {
    	  System.out.println("Balance Account = "+accbal);

      }

      public static void main(String args[])
      {
    	  int y;
    	  int accbal=10000;
    	  String userid = "12345678";
    	  String pswd = "12345";
    	  Scanner sc = new Scanner(System.in);
    	  int j=1;
    	  String userid1;
    	  String pswd1;
    	  while(true) {
    		  if(j>4) {
    			  System.exit(1);
    		  }
    	  System.out.println("Enter userid : ");
    	 userid1  = sc.nextLine();
    	  System.out.println("Enter password : ");
    	  pswd1 = sc.nextLine();
    	  j++;
    	  }
    	  ExcepProject obj=new ExcepProject();
    	  
    	  if(userid.equals(userid1) && pswd.equals(pswd1)) {
    		  //System.out.println("Both are equal");
    		  while(true) {
    			  	System.out.println("\n \n Select any one option : \n 1.Withdraw \n 2.Deposit \n 3.Balance \n 4.Exit \n");
    			  	y=sc.nextInt();
    			  	if(y==1 || y==2 || y==3 || y==4) {
    			  		switch(y)
    			  		{
    			  		case 1: obj.withdraw();
    			  				break;
    			  		case 2:obj.deposite();
    			  				break;
    			  		case 3:obj.checkbal();
    			  				break;
    			  		case 4:System.exit(1);
    			  				break;
    			  		default: System.out.println("enter valid option");

    			  		}
    			  	}

    		  }
    	  }
    	  else {
    		  System.out.println("Not matched..");
    	  }
      }



}
