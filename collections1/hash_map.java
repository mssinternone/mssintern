package collections1;
import java.util.HashMap;
import java.util.Map;
class Person {
	int age;
	String name;
	
	Person(int age,String name,HashMap<String,Integer> hobj){
		this.age=age;
		this.name=name;
		
		hobj.put(name,age);
	}
}
public class hash_map {
	public static void main(String...args) {
		HashMap<String,Integer> hobj=new HashMap();
		
		Person obj1=new Person(18,"binnu",hobj);
		Person obj2=new Person(19,"tulasi",hobj);
		Person obj3=new Person(16,"himani",hobj);
		
		System.out.println("The persons and there ages are : ");
		for(Map.Entry<String, Integer> m1:hobj.entrySet()) {
			System.out.println(m1.getKey()+" -> "+m1.getValue());
		}

}
}
