package collections;
import java.util.*;
public class LLists
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
LinkedList al=new LinkedList();
		
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