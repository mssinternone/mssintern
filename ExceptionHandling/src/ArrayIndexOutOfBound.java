import java.util.Scanner; 
public class ArrayIndexOutOfBound
   {
  public static void main( String args [] )
   {
   
	int[]  intArray = new int[6];
	System.out.println("Enter elements in index:");
	Scanner sc=new Scanner(System.in);
	
	try {
		for(int i=0;i<8;i++)
		{
			intArray[i] = sc.nextInt();
		}
		
	}
   catch( ArrayIndexOutOfBoundsException e ) 

  { 
   System.out.println( "array out of bound exception" );
  }
   System.out.println( "End of program" );


   }


   }