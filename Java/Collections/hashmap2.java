package collections;
import java.util.*;
public class hashmap2 {

	
	

	 public static void main(String[] args) {
	 // TODO Auto-generated method stub
	      Map m1=new HashMap();
	      m1.put(1,"Amit");  
	      m1.put(5,"Rahul");  
	      m1.put(2,"Jai");  
	      m1.put(6,"Amit");
	      Set s1=m1.entrySet();
	      System.out.println(s1);
	      Iterator i=s1.iterator();
	      while(i.hasNext()){  
	          Map.Entry entry=(Map.Entry)i.next();  
	          System.out.println(entry.getKey()+" "+entry.getValue());  
	      }  
	 }

	 }


