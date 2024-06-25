package databaseController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Person;

public class RegisterDB {
	public static void register(Person user) {
		Connection connection = DatabaseConnector.databaseConnector();
		String insertCmd = "INSERT INTO person_in4(id, name) VALUES (?,?);";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(insertCmd);
			preparedStatement.setInt(1, user.getId());
			preparedStatement.setString(2, user.getName());
			preparedStatement.executeUpdate();
			System.out.println("Them thanh cong!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
