package Collections;

//non generic collection
import java.util.*;
public class ArrList
{

	public static void main(String[] args)
	{
      ArrayList al=new ArrayList();
		
		al.add("Sravani");
		al.add(1);
		al.add(2);
		al.add(1);
		al.add("Bangari");
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
   }
}