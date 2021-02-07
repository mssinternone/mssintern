package collections1;
import java.io.*;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.*;
class Mit implements Serializable
{
	int i;
	String s;
	 Mit(int id,String name)
	 {
		 this.i=id;
		 this.s=name;
	 }
}
public class serial_obj {

	public static void main(String[] args) throws IOException {
		int i;
		Mit s1=new Mit (1," binnu");
		Mit s2=new Mit(2,"tulasi");
		Mit s3=new Mit(3,"siri");
		ArrayList<Mit> li=new ArrayList<>();
		li.add(s1);
		li.add(s2);
		li.add(s3);
		try {
		FileOutputStream fo =new FileOutputStream("path");
		ObjectOutputStream os=new ObjectOutputStream(fo);
		os.writeObject(li);
		fo.close();
		System.out.println("success");
	}catch(IOException e) {
		e.printStackTrace();
	}

}
}



