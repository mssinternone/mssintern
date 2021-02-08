package Collections;

import java.util.*;
public class ArrListiterator {

	//iterator
	
		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
	        ArrayList l=new ArrayList();
			
			l.add("Sravani");
			l.add(1);
			l.add("Bangari");
			System.out.println(l);
			Iterator i=l.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}

		}
	}
	
	

