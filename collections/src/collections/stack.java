package collections;
import java.util.*;
public class stack {
	 public static void main (String[] args) 
	    { 
		 
	        
			Stack stack = new Stack(); 
	        
	        stack.push(1); 
	        stack.push(2); 
	        stack.push(3); 
	        stack.push(4); 
	        stack.push("vivek"); 
	        stack.push(3.5); 
	        System.out.println(stack.pop());
	        System.out.println(stack);
	        System.out.println("Does the stack contains '3'? "+ stack.search(3)); 
	        System.out.println(stack.peek());
	    
	    }
}
