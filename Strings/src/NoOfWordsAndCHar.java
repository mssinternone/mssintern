import java.util.*;
public class NoOfWordsAndCHar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner s=new Scanner(System.in);
   System.out.println("Enter your string");
   String st=s.nextLine();
   int count=0;
   for(int i=0;i<st.length();i++)
   {
	   if(st.charAt(i)==' ')
	   {
		  count++;
	   }
   }
   System.out.println("No of Words are:"+(count+1));
   System.out.println("No of Characters are:"+st.length());
   
	}
}
