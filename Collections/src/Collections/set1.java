package Collections;
import java.util.Iterator;
import java.util.HashSet;
public class set1 {
public static void main(String[] args) {
HashSet al=new HashSet();
al.add(1);
al.add("kiran");
al.add("MES");
Iterator i=al.iterator();
while(i.hasNext())
{
System.out.print(i.next());
}
}
}


