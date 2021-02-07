package files;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class Sample implements Serializable{
	int id;
	String name;
	Sample(int id,String name){
		this.id=id;
		this.name=name;
	}
}

public class SerilizationExample {
	public static void main(String...args) throws IOException{
		FileOutputStream fo=new FileOutputStream("objectfile.txt");
//		Sample_one obj1=new Sample_one(1,"ganesh");
//		Sample_one obj2=new Sample_one(2,"vievk");
//		Sample_one obj3=new Sample_one(3,"Bhavani");
		Sample obj1=new Sample(1,"Ashu");
		Sample obj2=new Sample(2,"vivek");
		Sample obj3=new Sample(3,"Ganesh");
		
		ArrayList al=new ArrayList();
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		
		ObjectOutputStream os=new ObjectOutputStream(fo);
		os.writeObject(al);
		
	}
}
