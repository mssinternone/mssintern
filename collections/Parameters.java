import java.util.*;
class college{
	int id;
	String name;
	college(int id, String name){
		this.id =id;
		this.name = name;
	}
}
public class Parameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	college student1 = new college(1,"Ramesh");
	college student2 = new college(2,"Reshma");
	college student3 = new college(3,"Roja");
	ArrayList list = new ArrayList();
	list.add(student1);
	list.add(student2);
	list.add(student3);
	Iterator itr = list.iterator();
	while(itr.hasNext()) {
		college c = (college) itr.next();
		System.out.printf(c.id  + c.name);
		System.out.println("");
	}
	
	}

}
