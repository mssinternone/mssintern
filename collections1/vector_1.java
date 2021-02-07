package collections1;
import java.util.Vector;
import java.util.Iterator;
public class vector_1 {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("binnu");
		v.add("tulasi");
		v.add("hima");
		Iterator i=v.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		v.remove("tulasi");
		System.out.println(v);
		

	}

}
