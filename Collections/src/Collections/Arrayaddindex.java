package Collections;
import java.util.ArrayList;
import java.util.Iterator;
public class Arrayaddindex {
	public static void main(String[] args) {
		ArrayList li=new ArrayList();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(0,4);//adding at particular location
		li.add("the above list item should be 4");
		li.add(5);
		Iterator i= li.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
