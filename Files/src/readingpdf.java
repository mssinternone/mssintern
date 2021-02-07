  
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class readingpdf {
	public static void main(String args[]) throws IOException {
		File f=new File("javafile1.pdf");
		if(f.createNewFile()) {
			System.out.println("File created successfully");
			System.out.println(f.getAbsolutePath());
		}
		try {
			FileInputStream fin=new FileInputStream("javafile1.pdf");
			int val=0;
			while((val=fin.read())!=-1) {
				System.out.print((char)val);
			}
			
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}