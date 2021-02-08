import java.util.*;
import java.io.FileInputStream;
public class FileRead {

	public static void main(String[] args) {
	try {	// TODO Auto-generated method stub
	FileInputStream in = new FileInputStream("C:\\Users\\hemal\\Documents\\files\\hello.txt");
	int i =0;
	int vowels=0;
	int cons =0;
	while((i=in.read())!=-1) {
		char ch= (char) (i);
		 if (ch == 'a' || ch == 'e' || ch == 'i' ||
                 ch == 'o' || ch == 'u') {
			vowels++;
		}
		 else
			 cons++;
		
		System.out.print(ch);
		
	}
	System.out.println("");
	System.out.println("Vowels ="+vowels);
	System.out.println("Consonents ="+cons);
	}catch(Exception e) {
		System.out.println(e);
	}
	}
}
