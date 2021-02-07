package Collections;
import java.util.*;
public class Vector1{
	public static void main(String...args) {
		Vector obj=new Vector();
		obj.add(1);
		obj.add('a');
		obj.add("kiran");
		Enumeration itr=obj.elements();
		while(itr.hasMoreElements()) {
			System.out.println(itr.nextElement());
		}
	}
}

