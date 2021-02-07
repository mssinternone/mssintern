package files;
import java.util.*;
import java.io.*;
public class File1  
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		Properties p=new Properties();
		  FileOutputStream fo=new FileOutputStream(" fil.txt"); 
		p.setProperty("username", "ganesh");
		p.setProperty("password", "devil");
		p.store(fo,"File Properties"); 
		FileInputStream fi=new FileInputStream(" fil.txt");
		
		 p.load(fi);
		    System.out.println("usernmae:" +p.getProperty("username" ));  
		    System.out.println("password:" +p.getProperty("password"));
		
	}

}
