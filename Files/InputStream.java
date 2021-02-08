import java.io.FileInputStream;
public class InputStream {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
	FileInputStream in = new FileInputStream("C:\\Users\\hemal\\Documents\\myfile0.txt");
//	int i =in.read();
//	System.out.println((char)i);
//	in.close();
	int i = 0;
	while((i = in.read())!= -1) {
		System.out.print((char)i);
	}
	in.close();
	}

}
