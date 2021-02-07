package collections1;

import java.util.Stack;
import java.util.Iterator;

public class stack_1 {

	public static void main(String[] args) {
		Stack al=new Stack();
		al.push("bineetha");
		al.push("MES"); 
		al.pop();
		al.push("tulasi");
		al.push("siri");
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next());
		}
	}

}
