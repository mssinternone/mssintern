package Collections;
import java.util.ArrayList;
public class Remove_all {
public static void main(String[] args) {
ArrayList al=new ArrayList();
ArrayList a2=new ArrayList();
al.add(1);
al.add("kiran");
al.add("MES");
System.out.println("first array::"+al);
a2.add(2);
a2.add("pinky");
System.out.println("second array::"+a2);
al.addAll(a2);
System.out.println("after adding two arrays::"+al);
al.removeAll(a2);
System.out.println("removing array2 from array1::"+al);
}
}

