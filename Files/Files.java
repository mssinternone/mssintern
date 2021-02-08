import java.util.*;
import java.io.FileOutputStream;
public class Files {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
	
	FileOutputStream out =new FileOutputStream("C:\\Users\\hemal\\Documents\\files\\hello.txt");
	String str = "Hi all how are you";
	byte b[] = str.getBytes();
	out.write(b);
	//out.close();
	System.out.println("File created...");
	
	}
}
