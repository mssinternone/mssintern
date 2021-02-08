package collections;
import java.util.*;
public class HashMap1 {

	public static void main(String[] args) {
		
		Map <Integer,String> m= new HashMap();
		m.put(1,"one");
		m.put(2,"two");
		Set s=m.entrySet();
		Iterator i=s. iterator();
		while(i.hasNext());
		{
			Map.Entry m1=(Map.Entry)i.next();
			System.out.println(m1.getKey()+" "+m1.getValue());
		}
	}

}
   