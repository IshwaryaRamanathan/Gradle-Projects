package DAO;
import java.sql.*;

public class JDBC {
		
	Connection getConnection() {
		try {
			Connection c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "IshK@123");
			if(c!=null) {
				System.out.println("Connected");
				return c;
			}
			else {
				System.out.println("Failed");				
			}
		}catch(SQLException s) {
			System.err.format("SQL State : %s\n%s",s.getSQLState(), s.getMessage());
		}catch(Exception s) {
			s.printStackTrace();
		}
		
		return null;
	}

}
