package Filesexamples;
import java.io.*;
public class filedescriptorclass {
	public static void main(String args[]) {
		FileDescriptor fd=null;
		byte b[]= {48,49,50,51};
		try {
			FileOutputStream fo=new FileOutputStream("Javafiles.txt");
			FileInputStream fi=new FileInputStream("Javafiles.txt");
			fo.write(b);
			fd=fo.getFD();
			System.out.println(fd);
			int value=0;
			while((value=fi.read())!=-1) {
				System.out.println((char)value);
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
