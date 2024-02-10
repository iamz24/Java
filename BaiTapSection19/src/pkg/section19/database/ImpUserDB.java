package pkg.section19.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import pkg.section19.model.ModelUser;

public class ImpUserDB implements ServiceUserDB {

	@Override
	public void insert(ModelUser user) {
		// TODO Auto-generated method stub
		Connection connection = DatabaseConnector.databaseConnector();
		String insertCmd = "INSERT INTO khach_hang(ten, diachi) VALUES (?,?);";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(insertCmd, Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getAddress());
			preparedStatement.executeUpdate();
			ResultSet rs = preparedStatement.getGeneratedKeys();
			while(rs.next()) {
				int id = rs.getInt(1);
				user.setId(id);
			}
			System.out.println("Them thanh cong!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<ModelUser> view() {
		// TODO Auto-generated method stub
		List<ModelUser> list =  new ArrayList<ModelUser>();
		Connection connection = DatabaseConnector.databaseConnector();
		String viewCmd = "SELECT * FROM khach_hang";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(viewCmd);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				ModelUser user = convertToObj(rs);
				list.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	public static ModelUser convertToObj(ResultSet rs) throws SQLException {
		int id = rs.getInt("id");
		String ten = rs.getString("ten");
		String diaChi = rs.getString("diachi");
		
		ModelUser user = new ModelUser();
		user.setId(id);
		user.setName(ten);
		user.setAddress(diaChi);
		
		return user;
	}

	@Override
	public ModelUser checkUser(int id) {
		// TODO Auto-generated method stub
		Connection connection = DatabaseConnector.databaseConnector();
		String checkUserCmd = "SELECT * FROM khach_hang WHERE id = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(checkUserCmd);
			preparedStatement.setInt(1, id);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				ModelUser user = new ModelUser();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("ten"));
				user.setAddress(rs.getString("diachi"));
				return user;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
