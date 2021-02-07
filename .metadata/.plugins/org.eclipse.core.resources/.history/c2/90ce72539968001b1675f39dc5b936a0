import java.util.HashMap;
import java.util.Map;

class  Person{
	int age;
	String name;
	
	Person(int age,String name,HashMap<String,Integer> hobj){
		this.age=age;
		this.name=name;
		
		hobj.put(name,age);
	}
}
public class NameAge {
	public static void main(String...args) {
		HashMap<String,Integer> hobj=new HashMap();
		
		Person obj1=new Person(21,"Ashu",hobj);
		Person obj2=new Person(22,"Jillu",hobj);
		Person obj3=new Person(23,"Ramya",hobj);
		
		System.out.println("The persons and there ages are : ");
		for(Map.Entry<String, Integer> m1:hobj.entrySet()) {
			System.out.println(m1.getKey()+" -> "+m1.getValue());
		}
	}
}
