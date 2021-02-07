package collections1;

import java.util.HashSet;
import java.util.Set;

public class set_1 {

	public static void main(String[] args) {
		HashSet al=new HashSet();
		HashSet a2=new HashSet();
		
		 al.add(1);
		 al.add("binnu");
		 al.add("MES");
		 System.out.println("first array::"+al);
		 a2.add(2);
		 a2.add("kt");
		 System.out.println("second array::"+a2);
		 al.addAll(a2);
		 System.out.println("after adding two arrays::"+al);
		 al.removeAll(a2);
		 System.out.println("removing array2 from array1::"+al);

	}

}
