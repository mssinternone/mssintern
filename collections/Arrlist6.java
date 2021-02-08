package collections;

import java.util.*;

public class Arrlist6 {


	

		public static void main(String[] args) throws Exception
		{
			// TODO Auto-generated method stub
			try
			{
				
			
			 ArrayList<String> al=new ArrayList();
				
				al.add("ganesh");
				al.add("dinesh");
				al.add("mahesh");
				al.add("suresh");
				al.add("ganesh");
				System.out.println(al);
				
				int size=al.size();
				System.out.println(size);
				
				
			}
			catch(IndexOutOfBoundsException e){
				 System.out.println("Exception thrown: "
	                     + e);
			}
				
	      
	       
		}

		

	}

