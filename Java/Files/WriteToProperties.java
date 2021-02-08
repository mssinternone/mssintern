package filesexamples;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
public class WriteToProperties {
	public static void main(String[] args) throws IOException {
	
		Properties p =new Properties();
		FileOutputStream fo= new FileOutputStream("mainfile.properties");
		p.setProperty("uname", "abc");
		p.setProperty("pwd", "xyz");
		p.store(fo,"example");
	FileInputStream fi=new FileInputStream("mainfile.properties");
	p.load(fi);
	System.out.println(p.getProperty("uname"));
		
}
}