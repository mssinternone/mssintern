package Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
public class queue1 {
public static void main(String[] args) {
Queue al=new LinkedList();
al.add(1);
al.add("kiranmayi");
al.add("MES");
Iterator i=al.iterator();
while(i.hasNext())
{
System.out.print(i.next());
}
}
}


