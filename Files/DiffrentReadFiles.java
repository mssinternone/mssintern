package filesexamples;

import java.io.BufferedReader;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class DiffrentReadFiles {

	public static void main(String[] args) throws IOException {

		Properties p =new Properties();
		FileOutputStream fo= new FileOutputStream("mainfile1.properties");
		p.setProperty("uname", "abc");
		p.setProperty("pwd", "xyz");
		p.store(fo,"example2 ");
		FileInputStream fi=new FileInputStream("mainfile.properties");//num1
		p.load(fi);
		System.out.println(p.getProperty("pwd"));
		BufferedReader br=new BufferedReader(new FileReader("mainfile.properties"));
		for(int i =0;i<4;i++) {
		System.out.println(br.readLine());
		
		}
		
	}

}
