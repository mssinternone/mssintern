package files;
import java.io.*;
import java.util.*;

class Sample implements Serializable{
	int id;
	String name;
}

public class DeserializationExample {
	public static void main(String...args) throws Exception{
		FileInputStream fi=new FileInputStream("objectfile.txt");
		
		ObjectInputStream oi=new ObjectInputStream(fi);
		ArrayList al=new ArrayList();
		al=(ArrayList)oi.readObject();
		
		Iterator i=al.iterator();
		while(i.hasNext()) {
			Sample m=(Sample)i.next();
			System.out.print("\n"+m.id+" "+m.name+"\n");
		}
	}
}
