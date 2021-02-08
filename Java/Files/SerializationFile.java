import java.util.*;
import java.io.*;
class college implements Serializable{
	int id;
	String name;
	college(int id, String name){
		this.id =id;
		this.name = name;
	}
}
public class SerializationFile {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileOutputStream out = new FileOutputStream("Ser.txt");
		ObjectOutputStream obj = new ObjectOutputStream(out);
		college student1 = new college(1,"Ramesh");
		college student2 = new college(2,"Reshma");
		college student3 = new college(3,"Roja");
		obj.writeObject(student1);
		obj.writeObject(student2);
		obj.writeObject(student3);
	obj.flush();
	obj.close();
	System.out.println("File created");
	
	}

}
