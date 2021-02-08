import java.util.*;
public class LinkedListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> list = new LinkedList<String>();
		list.add("Hema");
		list.add("Indu");
		list.add("Sitha");
		list.add("Meena");
		System.out.println(list);
		ListIterator itr = list.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
