package Collections;
import java.util.Stack;
import java.util.Iterator;
public class stack_1 {
public static void main(String[] args) {
	Stack al=new Stack();
	al.push("kiranmayi");
	al.push("MES");
	al.pop();
	al.push("pinky");
	al.push("smily");
	Iterator i=al.iterator();
	while(i.hasNext())
	{
		System.out.print(i.next());
}
}
}


