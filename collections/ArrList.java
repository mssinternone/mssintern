
//non generic collection
package collections;
import java.util.*;
public class ArrList
{

	public static void main(String[] args)
	{
        ArrayList al=new ArrayList();
		
		al.add("ganesh");
		al.add(1);
		al.add(2);
		al.add(1);
		al.add("ganesh");
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
     }
}

