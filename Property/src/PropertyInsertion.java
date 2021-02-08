import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.*;

public class PropertyInsertion {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		OutputStream os = new FileOutputStream("Ganesh.propeties");
		Properties m = new Properties();
		m.setProperty("Name", "Ganesh");
		m.setProperty("No", "176C1A0456");
		m.setProperty("No1", "176C1A0456");
		m.store(os, null);
		
	}
}
