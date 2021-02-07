package collections;
import java.util.*;
public class Arrlist3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList();
		
		al.add("vivek");
		al.add("ganesh");
		al.add("mahesh");
		al.add("suresh");
		al.add("ramesh");
		for(String n: al)//enhanced for-loop
		{
			System.out.println(n);
		}
		

	}

}
