package collections1;
import java.util.Iterator;
import java.util.ArrayList;

public class iterator1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(1);
		al.add("bineetha");
		al.add("MES");
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next());
		}
		 		 
	}

}