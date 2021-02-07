package collections1;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;

public class Queue_1 {

	public static void main(String[] args) {
		Queue al=new LinkedList();
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
