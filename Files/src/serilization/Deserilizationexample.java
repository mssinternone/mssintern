package serilization;
import java.io.*;
public class  Deserilizationexample {
public static void main(String args[]) throws IOException, ClassNotFoundException {
FileInputStream fis=new FileInputStream("serialize.txt");
ObjectInputStream ois=new ObjectInputStream(fis);
demo obj1=(demo) ois.readObject();
System.out.println(obj1.id+" "+obj1.s);
demo obj2=(demo) ois.readObject();
System.out.println(obj2.id+" "+obj2.s);
demo obj3=(demo) ois.readObject();
System.out.println(obj3.id+" "+obj3.s);
}

}