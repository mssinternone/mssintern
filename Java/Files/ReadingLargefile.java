package Filesexamples;
import java.io.*;
public class ReadingLargefile {
	public static void  main(String args[]) {
		try {
			FileInputStream fin=new FileInputStream("demo.txt");
			int val=0;
			while((val=fin.read())!=-1) {
				System.out.print((char)val);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
		

}
