
import java.io.*;
public class writerclass {
public static void main(String[] args) throws IOException {
Writer obj=new FileWriter("demo523.txt");
String s="I Love my country";
String s1="hi";
obj.write(s);
obj.write(s1);
obj.close();
Reader obj1=new FileReader("demo523.txt");
int val=0;
while((val=obj1.read())!=-1) {
System.out.print((char)val);
}
System.out.println("");
System.out.println("File write successfully");

}

}