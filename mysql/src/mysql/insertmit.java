package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class insertmit {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
     Class.forName("com.mysql.jdbc.Driver");
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mss","root","root");
     System.out.println("Connection established");
     PreparedStatement ps=con.prepareStatement("insert into mit(name,age) values('ramesh',23)");
     int result=ps.executeUpdate();
     System.out.println(result);
	}
}
