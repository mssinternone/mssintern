package collections1;

import java.util.ArrayList;

public class add_all {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		ArrayList a2=new ArrayList();
		
		 al.add(1);
		 al.add("binnu");
		 al.add("MES");
		 System.out.println(al);
		 a2.add(2);
		 a2.add("kt");
		 System.out.println(a2);
		 al.addAll(a2);
		 System.out.println(al);
		 
	}

}
