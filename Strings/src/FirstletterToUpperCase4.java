import java.util.Scanner;

public class FirstletterToUpperCase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   String s=sc.nextLine();
   char[] a=new char[s.length()];
   int j=0;
   for (int i=0;i<s.length();i++)
   {    
	   a[i]=s.charAt(i);
	   a[0]=Character.toUpperCase(s.charAt(0));
   }
    for(j=0;j<s.length();j++)
    {
    	if(a[j]==' ')
 	   {
 		  a[j+1]=Character.toUpperCase(s.charAt(j+1));
 	   }	 
    }
    for (int k=0;k<s.length();k++)
    {    
 	  System.out.print(a[k]);
    }
	}

}
