package Collections;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
public class Readproperties {
	public static void main(String...args) 
			throws IOException{
		Properties p=new Properties();
		FileInputStream fi=new FileInputStream("credentials.properties");
		p.load(fi);
		System.out.println("Username : "+p.getProperty("uname"));
		System.out.println("Password : "+p.getProperty("pwd"));
	}
}