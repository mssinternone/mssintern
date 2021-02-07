package files;
import java.io.*;
import java.util.Properties;
public class Prop 
{

	public static void main(String[] args) throws IOException 
	{
		Properties p=new Properties(System.getProperties());
		  FileOutputStream fo=new FileOutputStream(" sys.txt"); 
		  System.setProperties(p);
		  

	}

}
