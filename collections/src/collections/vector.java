//Vector class implements a growable array of objects. Vectors basically fall in legacy classes 
// vector implements list and extends stack


package collections;
import java.util.*;
public class vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int i,n=8;
		Vector v = new Vector(n); //declaring vector with size
		for (i = 1; i <= n; i++) 
            v.add(i);           //adding element
		
		System.out.println(v); // Printing elements 
        v.add("vivek");
		v.remove(3);//remove element at position
		System.out.println(v);
		
		System.out.println("The Object that is replaced is: "+ v.set(4, 50)); //using set method to change values
		 for (i = 0; i < v.size(); i++) 
	            System.out.print(v.get(i) + " "); 
	    } 
	}


