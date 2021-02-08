import java.util.*;
public class LinkedListCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	LinkedList <String> list = new LinkedList<String>();
	list.add("Hema");
	list.add("Indu");
	list.add("Sitha");
	list.add("Meena");
	
	System.out.println(list);
	
	
	LinkedList list1 = new LinkedList();
	list1.add(1);
	list1.add(2);
	list1.add('e');
	list1.add('f');
	System.out.println("Linked List:"+list1);
	
	list1.addAll(list);
	System.out.println("Add all :"+list1);
	
	list1.remove(1);
	System.out.println("Remove a particular element: "+list1);
	
	LinkedList list2 = new LinkedList();
	list2.add('e');
	list2.add('f');
	list2.add('g');
	list2.removeAll(list1);
	System.out.println("Remove all: "+list2);
	
	}

}
