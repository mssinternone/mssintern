package collections;
import java.util.*; 

public class queue { 
  
    public static void main(String args[]) 
    { 
        Queue<Integer> pq = new PriorityQueue<>(); 
  
        pq.add(1); 
        pq.add(2);
        pq.add(5); 
        pq.add(9);
        pq.add(7);
        System.out.println(pq); 
          pq.remove(5);
         System.out.println(pq);
         System.out.println(pq.poll());//prints and delete the element
         System.out.println(pq);
         
    } 
} 