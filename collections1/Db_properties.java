package collections1;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
public class Db_properties {

	public static void main(String[] args)throws IOException {
		FileOutputStream fo =new FileOutputStream("db.properties");
		Properties p=new Properties();
		p.setProperty("uname", "bineetha");
		p.setProperty("pwd", "binnu@1234");
		p.store(fo,"User Credentials");;
	}

}
