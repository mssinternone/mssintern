import java.util.*;
public class ArrayIndexOutOfBound {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		   
		int[]  intArray = new int[6];
		System.out.println("Enter elements in index:");
		Scanner sc=new Scanner(System.in);

		try {
		for(int i=0;i<7;i++)
		{
		intArray[i] = sc.nextInt();
		}

		}
		   catch( ArrayIndexOutOfBoundsException e )

		  {
		   System.out.println( "exception caught" );
		  }
		   System.out.println( "End of program" );


		   }


		   }



