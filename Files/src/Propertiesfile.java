
import java.util.*;
public class Propertiesfile {
public static void main(String args[]) {
Properties p=System.getProperties();
Set s=p.entrySet();
Iterator i=s.iterator();
while(i.hasNext()) {
Map.Entry me=(Map.Entry) i.next();
System.out.println(me.getValue()+" "+me.getValue());
}
}

}