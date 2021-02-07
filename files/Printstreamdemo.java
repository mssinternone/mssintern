package files;
import java.io.*;
public class Printstreamdemo {
	public static void main(String args[]) {
		try {
			FileOutputStream fo=new FileOutputStream("demo.txt");
			PrintStream ps=new PrintStream(fo);
			ps.println("Hello");
			ps.println("hello java");
			System.out.println("hello");
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}
