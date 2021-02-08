import java.util.*;
import java.io.*;
public class PropertiesReadWrite {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
	Properties p = new Properties();
	FileOutputStream out = new FileOutputStream("file.properties");
	p.setProperty("Name ","Geetha");
	p.setProperty("Password ", "text");
	p.store(out,"property_name");
	System.out.println("File Created");
	FileInputStream in = new FileInputStream("file.properties");
	p.load(in);
	System.out.println(p.getProperty("Password "));
	
	}

}
