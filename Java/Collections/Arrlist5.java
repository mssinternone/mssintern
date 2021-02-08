package collections;
import java.util.*;
public class Arrlist5 {

	
	

		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
	ArrayList<Integer> al=new ArrayList();
	ArrayList<Integer> al2=new ArrayList();
			
			
			al.add(1);
			al.add(25);
			al.add(31);
			
			Iterator<Integer> i=al.iterator();
			Iterator<Integer> i1=al2.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
			    al2.add(25); 
		        al2.add(30); 
		        al2.add(31); 
		        al2.add(35); 
		        al.addAll(al2);
		        al2.retainAll(al);
		        System.out.println("after retaining al2"+al2);
		        al.retainAll(al2);
		        System.out.println("after retaining al"+al);
		        System.out.println("Printing all the elements");
		        for(Integer number :al)
		        {
		        	System.out.println(number);
		        }
		        al.remove(al2);
		        System.out.println("after removal al "+al);
		        
		        
		        
		        

	      }
	}
