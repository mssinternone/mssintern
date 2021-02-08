import java.util.*;
public class SetIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set st = new HashSet();
		st.add("Array");
		st.add("Sets");
		st.add("Hash");
		st.add("List");
		Iterator itr = st.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
