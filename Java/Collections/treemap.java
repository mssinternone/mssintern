package collections;
import java.util.Map;
import java.util.TreeMap;
public class treemap {
	
	
	public static void main(String args[]) {
	 TreeMap<Integer,String> tm=new TreeMap<Integer,String>();  
	 
	 tm.put(100,"Amit");  
	 tm.put(101,"Vijay");  
	 tm.put(102,"Rahul");  
	 tm.remove(102);
	for(Map.Entry m:tm.entrySet()){  
	  System.out.println(m.getKey()+" "+m.getValue());  
	}
	}
}
