import java.util.*;
import java.io.*;
public class PropertiesFile {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
	FileReader reader = new FileReader("C:\\Users\\hemal\\Documents\\myfile1.txt");
	Properties p = new Properties();
	p.load(reader);
	System.out.println(p.getProperty("user"));
	System.out.println(p.getProperty("password"));
	
	}

}
