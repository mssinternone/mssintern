package Filesexamples;

import java.io.FileInputStream;
import java.io.IOException;

public class Readingpdf {
	public static void main(String args[]) {
		try {
			FileInputStream fin=new FileInputStream("files.pdf");
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
