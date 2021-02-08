import java.util.*;
public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Map <Integer,String>mp = new HashMap<Integer,String>();
	mp.put(1,"Geetha");
	mp.put(2,"Reena");
	mp.put(3,"Meena");
//	System.out.println("The elements are: "+mp);
	for(Map.Entry<Integer, String> pair : mp.entrySet()) {
		System.out.format("Key: %d, value :%s",pair.getKey(),pair.getValue());
		System.out.println("");
	}
	}

}
