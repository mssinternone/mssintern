package collections1;
import java.util.*;

public class set_to_list {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(1);
		al.add("bineetha");
		al.add("MES");
		System.out.println("list::"+al);
		HashSet set = new HashSet();
		
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			set.add(itr.next());
		}
		System.out.println(set);
}

	}


