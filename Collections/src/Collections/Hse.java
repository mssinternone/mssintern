package Collections;
import java.util.*;
public class Hse {
	public static void main(String...args) {
		ArrayList aobj=new ArrayList();
		aobj.add(1);
		aobj.add("kiran");
		aobj.add('a');
		aobj.add(1);
		System.out.println(aobj);
		Iterator itr=aobj.iterator();
		HashSet hobj=new HashSet();
		while(itr.hasNext()) {
			hobj.add(itr.next());
		}
		System.out.println(hobj);
	}
}
