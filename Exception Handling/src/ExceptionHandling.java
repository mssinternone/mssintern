
public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try
         {
        	 int a=1/0;
         }
         catch(ArithmeticException e)
         {
        	 System.out.println(e);
         }
         finally{
     		System.out.println("This is in Finally Block"); 
     	 }
	}
}
