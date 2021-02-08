package collections;
import java.util.*;

	
	public class Arrlist2 {

		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			ArrayList<String> al=new ArrayList();
			
			al.add("ganesh");
			al.add("dinesh");
			Iterator i=al.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}

		}

	
}
