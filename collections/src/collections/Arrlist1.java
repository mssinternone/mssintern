package collections;
import java.util.*;
public class Arrlist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList al=new ArrayList();
	    al.add("vivek");
	     al.add(1);
	     al.add(2);
	     al.add(2.5);
	     Iterator i=al.iterator();
	     while(i.hasNext())
			{
				System.out.println(i.next());
			}
	
	}

	
}
