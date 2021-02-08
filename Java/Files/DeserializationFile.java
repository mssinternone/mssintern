import java.util.*;
import java.io.*;

public class DeserializationFile {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
	FileInputStream in = new FileInputStream("ser.txt");
	ObjectInputStream obj = new ObjectInputStream(in);
	
	college c = (college)obj.readObject();
	college c1 = (college)obj.readObject();
	college c2 = (college)obj.readObject();
	System.out.println(c.id+ " "+c.name);
	System.out.println(c1.id+ " "+c1.name);
	System.out.println(c2.id+ " "+c2.name);
	
	obj.close();
	}

}
