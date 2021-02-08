package Filesexamples;
import java.io.*;
public class Filecreation {
	public static void main(String args[]) {
		try {
		File f=new File("javafile1.txt");
		if(f.createNewFile()) {
			System.out.println("File created successfully");
			System.out.println(f.getAbsolutePath());
		}
		else {
			System.out.println("File is not created");
		}
		
	   }
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
