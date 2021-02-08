package Filesexamples;
import java.io.*;
public class Readingcsv {
	public static void main(String args[]) {
		try {
			FileInputStream fin=new FileInputStream("files.csv");
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
