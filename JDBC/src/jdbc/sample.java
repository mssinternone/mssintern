package jdbc;

import java.sql.*;

public class sample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

     Class.forName("com.mysql.jdbc.Driver");
     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample_schema","root","root");
     System.out.println("Entered into DataBase..");
     
	PreparedStatement ps = con.prepareStatement("insert into sample values(3,'Bangari',21)");
	ps.executeUpdate();
	System.out.println("done..new welcome");
	
	}
	}

