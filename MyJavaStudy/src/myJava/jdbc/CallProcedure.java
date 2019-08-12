package myJava.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CallProcedure {

	static Connection connection = null;
	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			connection = DriverManager.getConnection(url, "system", "oracle");
			Statement statement = connection.createStatement();
			CallableStatement cs = connection.prepareCall("{call recins87(?,?)}");
			
			cs.setString(1, "Mohit");
			cs.setInt(2, 33000);
			cs.executeUpdate();
			ResultSet resultSet = statement.executeQuery("select * from Employee1");
			while(resultSet.next())
			{
				System.out.println(resultSet.getString(1));
				System.out.println(resultSet.getString(2));
			}
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
