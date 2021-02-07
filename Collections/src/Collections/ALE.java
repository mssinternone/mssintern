package Collections;
import java.util.*;
class sample{
	int  no;
	String name;
	sample(int no,String name){
		this.no=no;
		this.name=name;
	}
}
public class ALE {
	public static void main(String...args) {
		sample obj1=new sample(1,"kiran");
		sample obj2=new sample(2,"pinky");
		sample obj3=new sample(3,"smile");
		ArrayList alone=new ArrayList();
		alone.add(obj1);
		alone.add(obj2);
		alone.add(obj3);
		Iterator i=alone.iterator();
		System.out.print("\nThe Elements are : ");
		while(i.hasNext()) {
			sample m=(sample)i.next();
			System.out.print("\n"+m.no+" "+m.name+"\n");
		}
		LinkedList llobj=new LinkedList();
		llobj.add(1);
		llobj.add(2);
		llobj.add(3);		
		System.out.print(llobj);
		
	}
}
