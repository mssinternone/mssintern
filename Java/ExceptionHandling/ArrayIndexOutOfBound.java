package ExceptionHandling;

public class ArrayIndexOutOfBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String db[] = {"Oracle","Sql Server","MySql","DB2","Informix"};
		try
		{
			for(int c=0;c<6;c++)
			{
				System.out.println(db[c]);
			}
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println(a);
		}
			
	}

}
