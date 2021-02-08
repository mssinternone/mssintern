package Exceptionhandling;

public class ArithmeticException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		try
		{
			a=0;
			b=10;
			c=b/a;
			System.out.println("this line will not be executed");
			
		}
      catch(ArithmeticException e)
		{
    	  System.out.println("divided by zero");
		}
		System.out.println("Hi Alekhya");
	}

}
