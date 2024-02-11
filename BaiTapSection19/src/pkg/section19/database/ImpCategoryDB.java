package pkg.section19.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import pkg.section19.model.ModelCategory;

public class ImpCategoryDB implements ServiceCategoryDB {

	@Override
	public void insert(ModelCategory category) {
		// TODO Auto-generated method stub
		Connection connection = DatabaseConnector.databaseConnector();
		String insertCmd = "INSERT INTO category(ten) VALUES (?);";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(insertCmd, Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, category.getTen());
			preparedStatement.executeUpdate();
			ResultSet rs = preparedStatement.getGeneratedKeys();
			while (rs.next()) {
				int id = rs.getInt(1);
				category.setId(id);
				System.out.println("Them thanh cong!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void update(ModelCategory category) {
		// TODO Auto-generated method stub
		Connection connection = DatabaseConnector.databaseConnector();
		String updateCmd = "UPDATE category SET ten = ? WHERE id = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(updateCmd);
			preparedStatement.setString(1, category.getTen());
			preparedStatement.setInt(2, category.getId());
			preparedStatement.executeUpdate();
			System.out.println("Update thanh cong!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Connection connection = DatabaseConnector.databaseConnector();
		String deleteCmd = "DELETE FROM category WHERE id = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(deleteCmd);
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
			System.out.println("Xoa thanh cong!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public ModelCategory checkCategory(int id) {
		// TODO Auto-generated method stub
		Connection connection = DatabaseConnector.databaseConnector();
		String checkCategoryCmd = "SELECT * FROM category WHERE id = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(checkCategoryCmd);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				ModelCategory category = convertToObj(rs);
				return category;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Xay ra loi: "+e);
		}
		return null;
	}
	
	public static ModelCategory convertToObj(ResultSet rs) throws SQLException {
		int id = rs.getInt("id");
		String ten = rs.getString("ten");
		
		ModelCategory category = new ModelCategory();
		category.setId(id);
		category.setTen(ten);
		
		return category;
	}

}
