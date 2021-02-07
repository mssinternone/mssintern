package collections1;
import java.io.*;
import java.util.Properties;
public class write_property {

	public static void main(String[] args) throws IOException {
			FileOutputStream fo =new FileOutputStream("local.properties");
			Properties p=new Properties();
			p.setProperty("username", "Bineetha");
			p.setProperty("password", "password");
			p.store(fo,"commit");

	}

}
