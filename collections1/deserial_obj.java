package collections1;
import java.io.*;
import java.util.ArrayList;
import java.util.*;
class Mss implements Serializable
{
	int i;
	String s;
	 Mss(int id,String name)
	 {
		 this.i=id;
		 this.s=name;
	 }
public static class deserial_obj {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		try {
			FileInputStream fi =new FileInputStream("D:\\workspace\\SerializeId\\test.ser");
			ObjectInputStream obje=new ObjectInputStream(fi);
			ArrayList li=(ArrayList) obje.readObject();
			Iterator i= li.iterator();
			while(i.hasNext()) {
				Mss s = (Mss) i.next();
				System.out.println(s.i+s.s);
			}
			fi.close();
			System.out.println("success");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}



	}
}


