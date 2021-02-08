package Collections;

import java.util.*;
public class ArrListstrings {
	
	//generic iterators
	
		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			ArrayList<String> al=new ArrayList();
			
			al.add("Bangari");
			al.add("Sravani");
			Iterator i=al.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}

		}

	}
	

