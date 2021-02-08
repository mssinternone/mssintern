package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbc1 {
	
	
	            public static void main(String args[]) throws Exception {
	            	
	            	Class.forName("com.mysql.jdbc.Driver");
	            	
	            	Connection  con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sample_schema","root","root");
	            	
	            	
	            	
	            	System.out.println("entered into a database...");
	            	
	            	PreparedStatement ps= con.prepareStatement("insert into sample values(1,'alekhya',21"));
	            	
	            	ps.executeUpdate();
	            	 System.out.println("done");
	            	
	            
	

}
}