import java.util.Scanner; 
class MyException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MyException(String e) {
		super(e);
	}
	public MyException()
	{
		
	}

	void demo(int age) {
	try {
			if( age<18)
			     { 
				   throw new MyException("Age is invalid");
			     }
			   else 
			   {
				   System.out.println("age valid");
			        }
		   }
		   catch(MyException e)
		   {
			   System.out.println(e);
		   }
		}
}




public class CustomException 
   {


public static void main( String args []) throws MyException
   {
     int age;
	System.out.println("Enter age of person to get vote id:");
	Scanner sc=new Scanner(System.in);
	age=sc.nextInt();
	MyException my=new MyException();
	my.demo(age);
   
   }
   }
