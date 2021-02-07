package files;
import java.io.*;
import java.util.Properties;
public class ReadDifferentApproaches {

	public static void main(String[] args) throws IOException {
		
		try {
			FileInputStream fin=new FileInputStream("demo.txt");
			int val=0;
			while((val=fin.read())!=-1) {
				System.out.print((char)val);
			}
			val=0;
			BufferedInputStream bin=new BufferedInputStream(new FileInputStream("demo.txt"));
			while((val=bin.read())!=-1) {
				System.out.print((char)val);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		    
}
}