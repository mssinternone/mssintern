import java.util.Scanner;

public class OutofIndexBoundary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner s=new Scanner(System.in);
         System.out.println("Enter Your String");
         String str=s.nextLine();
         char[] a=str.toCharArray();
         try{for(int i=0;i<=str.length();i++)
         {
        	 System.out.println(a[i]);
         }
         }
         catch(ArrayIndexOutOfBoundsException e)
         {
        	 System.out.println(e);
        	 System.out.println("Exception was handled");
         }
	}

}
