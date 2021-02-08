import java.util.*;
public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List a=new ArrayList();
      a.add("Ganesh");
      a.add("Vennala");
      a.add("Anupama");
      a.add(1);
      ListIterator b=a.listIterator();
      while(b.hasNext())
      {
    	 System.out.println(b.next()); 
      }
      
	}
}
