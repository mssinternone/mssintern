
import java.io.*;
public class bufferreader {
public static void main(String[] args) throws IOException {
InputStreamReader in=new InputStreamReader(System.in);
BufferedReader buf=new BufferedReader(in);
System.out.println("Enter your Name");
String s=buf.readLine();
double i=Double.parseDouble(s);
System.out.println(i);
}

}

