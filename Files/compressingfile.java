package Filesexamples;
import java.io.*;
import java.util.zip.DeflaterOutputStream;
public class compressingfile {
	public static void main(String args[]) {
		byte b[]= {48,49,50,51,52};
		try {
			
			FileInputStream fin=new FileInputStream("demo.txt");
			FileOutputStream fout=new FileOutputStream("demo23.txt");
			DeflaterOutputStream dout=new DeflaterOutputStream(fout);
			int val=0;
			while((val=fin.read())!=-1) {
				System.out.print((char)val);
			}
			fout.write(b);
			System.out.println("File Compressed Successfully");
			
			
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}



