import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//import javax.imageio.stream.FileImageInputStream;

public class PropertyRead {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Properties p=new Properties();
       FileInputStream a=new FileInputStream("D:\\INTERNSHIP\\java\\Property\\Ganesh.properties");
       p.load(a);
       System.out.println(p.getProperty("Name"));
	}

}
