package collections;
import java.util.*;
public class Arraylist3 {
	
	
	

		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
	        ArrayList l=new ArrayList();
			
			l.add("ganesh");
			l.add(1);
			l.add("ganesh");
			System.out.println(l);
			Iterator i=l.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}

		}
	}

