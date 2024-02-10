package pkg.section19.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
	public static Connection databaseConnector() {
		final String url = "jdbc:mysql://localhost:3306/shop_ban_hang";
		final String user = "root";
		final String password = "";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		Connection connection = databaseConnector();
		if (connection != null) {
			System.out.println("Connect done!");
		} else {
			System.out.println("Connect fail!");
		}
	}
}
