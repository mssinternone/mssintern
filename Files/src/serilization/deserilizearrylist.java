package serilization;
import java.io.*;
import java.util.*;
public class deserilizearrylist {
public static void main(String args[]) throws IOException, ClassNotFoundException {
try {
FileInputStream fis=new FileInputStream("alobj.txt");
ObjectInputStream ois1=new ObjectInputStream(fis);
ArrayList<demo1> obj1=new ArrayList<demo1>();
obj1=(ArrayList) ois1.readObject();
/*
* Iterator<demo1> i=obj1.iterator(); while(i.hasNext()) { demo1
* obj=(demo1)i.next(); System.out.println(obj.id); }
*/
for(demo1 obj:obj1) {
System.out.println(obj);
}
}
catch(Exception e) {
System.out.println("Hello Exception");
}
}

}