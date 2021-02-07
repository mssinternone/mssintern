package collections;
import java.util.*;
public class Arrlist2 
{
	public static void main(String[] args)
	{
	ArrayList<String> al=new ArrayList();
	
	al.add("jai");
	al.add("jiiiii");
	Iterator i=al.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
    }
}
}