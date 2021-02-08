package Filesexamples;
import java.io.*;
import java.util.zip.InflaterInputStream;
public class Decompessingthefile {
	public static void main(String args[]) {
		try {
			FileInputStream fin=new FileInputStream("demo23.txt");
			InflaterInputStream io=new InflaterInputStream(fin);
			int value=0;
			while((value=io.read())!=-1) {
				System.out.println((char)value);
			}
			System.out.println("Execution Completed");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
