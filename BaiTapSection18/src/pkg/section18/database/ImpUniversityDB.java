package pkg.section18.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.xml.crypto.Data;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;

import pkg.section18.model.ModelUniversity;

public class ImpUniversityDB implements ServiceUniversityDB  {

	@Override
	public void insert(ModelUniversity university) {
		// TODO Auto-generated method stub
		Connection connection = DatabaseConnector.DatabaseConnector();
		String insertCmd = "INSERT INTO university(ten, diachi) VALUES (?,?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(insertCmd, Statement.RETURN_GENERATED_KEYS); //lấy id mà auto increment cấp
			preparedStatement.setString(1, university.getName());
			preparedStatement.setString(2, university.getAddress());
			preparedStatement.executeUpdate();
			ResultSet rs = preparedStatement.getGeneratedKeys();
			while(rs.next()) {
				university.setId(rs.getInt(1));//đẩy id lấy được vào cho id của đối tượng
			}
			System.out.println("Them du lieu thanh cong!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void update(ModelUniversity university) {
		// TODO Auto-generated method stub
		Connection connection = DatabaseConnector.DatabaseConnector();
		String updateCmd = "UPDATE university SET ten = ?, diachi = ? WHERE id = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(updateCmd);
			preparedStatement.setString(1, university.getName());
			preparedStatement.setString(2, university.getAddress());
			preparedStatement.setInt(3, university.getId());
			preparedStatement.executeUpdate();
			System.out.println("Update thành công!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Connection connection = DatabaseConnector.DatabaseConnector();
		String deleteCmd = "DELETE FROM university WHERE id = ?;";
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
	public ModelUniversity getIf(int id) {
		// TODO Auto-generated method stub
		Connection connection = DatabaseConnector.DatabaseConnector();
		String getifCmd = "SELECT * FROM university WHERE id = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(getifCmd);
			preparedStatement.setInt(1, id);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				ModelUniversity university = convertToObj(rs);
				return university;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<ModelUniversity> search(String name) {
		// TODO Auto-generated method stub
		List<ModelUniversity> listUni = new ArrayList<ModelUniversity>();
		Connection connection = DatabaseConnector.DatabaseConnector();
		String searchCmd = "SELECT * FROM university WHERE ten LIKE ? ;";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(searchCmd);
			preparedStatement.setString(1, "%" + name + "%");
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				ModelUniversity university = convertToObj(rs);
				listUni.add(university);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return listUni;
	}
	
	public ModelUniversity convertToObj(ResultSet rs) throws SQLException {
		int id = rs.getInt("id");
		String ten = rs.getString("ten");
		String diachi = rs.getString("diachi");
		
		ModelUniversity university = new ModelUniversity();
		university.setId(id);
		university.setName(ten);
		university.setAddress(diachi);
		
		return university;
	}

}	