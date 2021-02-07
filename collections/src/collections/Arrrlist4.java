
package collections;
import java.util.*;
public class Arrrlist4
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
ArrayList<Integer> al1=new ArrayList();
ArrayList<Integer> al2=new ArrayList();
		
		
		al1.add(1);
		al1.add(25);
		al1.add(31);
		
		Iterator<Integer> i=al1.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		    al2.add(25); 
	        al2.add(30); 
	        al2.add(31); 
	        al2.add(35); 
	        Iterator<Integer> i1=al2.iterator();
	        while(i1.hasNext())
			{
				System.out.println(i1.next());
			}
	        al1.addAll(al2);
	        al2.retainAll(al1);
	        System.out.println("after retaining al2"+al2);
	        al1.retainAll(al2);
	        System.out.println("after retaining al"+al1);
	        System.out.println("Printing all the elements");
	        for(Integer number :al1)
	        {
	        	System.out.println(number);
	        }
	        al1.remove(al2);
	        System.out.println("after removal al "+al1);
	        
	        
	        
	        

      }
}