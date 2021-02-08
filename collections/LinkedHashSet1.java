package collections;
import java.util.*;
public class LinkedHashSet1 {
	
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	          LinkedHashSet obj=new LinkedHashSet();
	          obj.add(1);
	  obj.add(2);
	  obj.add(1);
	  obj.add(1111);
	  obj.add(21);
	  obj.add(0);
	  System.out.println(obj);
	  LinkedHashSet obj1=new LinkedHashSet(obj);
	  System.out.println(obj.addAll(obj1));
	  obj1.add(22);
	  System.out.println(obj.addAll(obj1));
	  System.out.println(obj);
	  obj.add(20);
	  obj.add(30);
	  obj.retainAll(obj);
	  System.out.println(obj);
	  obj.add(90);
	  obj.removeAll(obj1);
	  System.out.println(obj);
	 
	}

	}

