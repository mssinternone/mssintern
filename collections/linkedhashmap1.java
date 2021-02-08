package collections;
import java.util.*;
public class linkedhashmap1 {
	

	public static void main(String args[]) {
	 LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
	 
	 hm.put(100,"Amit");  
	 hm.put(101,"Vijay");  
	 hm.put(102,"Rahul");  
	 hm.remove(102);
	for(Map.Entry m:hm.entrySet()){  
	  System.out.println(m.getKey()+" "+m.getValue());  
	}
	}
	}


