package pkg.section18.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;

import pkg.section18.model.ModelStudent;
import pkg.section18.model.ModelUniversity;

public class ImpStudentDB implements ServiceStudentDB {

	@Override
	public void insert(ModelStudent student) {
		// TODO Auto-generated method stub
		Connection connection = DatabaseConnector.DatabaseConnector();
		String insertCmd = "INSERT INTO student(ten, tuoi, uni) VALUES (?,?,?);";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(insertCmd, Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, student.getTen());
			preparedStatement.setInt(2, student.getAge());
			preparedStatement.setInt(3, student.getUniversity().getId());
			preparedStatement.executeUpdate();
			ResultSet rs = preparedStatement.getGeneratedKeys();
			while (rs.next()) {
				student.setId(rs.getInt(1));
			}
			System.out.println("Them sinh vien thanh cong!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void update(ModelStudent student) {
		// TODO Auto-generated method stub
		Connection connection = DatabaseConnector.DatabaseConnector();
		String updateCmd = "UPDATE student SET ten = ?, tuoi = ?, uni = ? WHERE id = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(updateCmd);
			preparedStatement.setString(1, student.getTen());
			preparedStatement.setInt(2, student.getAge());
			preparedStatement.setInt(3, student.getUniversity().getId());
			preparedStatement.setInt(4, student.getId());
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
		Connection connection = DatabaseConnector.DatabaseConnector();
		String deleteCmd = "DELETE FROM student WHERE id = ?";
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
	public ModelStudent searchById(int id) {
		// TODO Auto-generated method stub
		Connection connection = DatabaseConnector.DatabaseConnector();
		String searchById = "SELECT student.*, university.ten AS 'uniname' FROM student INNER JOIN university ON student.uni = university.id WHERE student.id = ?;";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(searchById);
			preparedStatement.setInt(1, id);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				ModelStudent student = convertToObj(rs);
				return student;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public List<ModelStudent> searchByAge(int age) {
		// TODO Auto-generated method stub
		List<ModelStudent> list = new ArrayList<ModelStudent>();
		
		Connection connection = DatabaseConnector.DatabaseConnector();
		String searchByAge = "SELECT student.*, university.ten AS 'uniname' FROM student INNER JOIN university ON student.uni = university.id WHERE student.tuoi = ?;";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(searchByAge);
			preparedStatement.setInt(1, age);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				ModelStudent student = convertToObj(rs);
				list.add(student);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public List<ModelStudent> searchByName(String name) {
		// TODO Auto-generated method stub
		List<ModelStudent> list = new ArrayList<ModelStudent>();
		Connection connection = DatabaseConnector.DatabaseConnector();
		String searchByName = "SELECT student.*, university.ten AS 'uniname' FROM student INNER JOIN university ON student.uni = university.id WHERE student.ten LIKE ?;";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(searchByName);
			preparedStatement.setString(1, "%"+name+"%");
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				ModelStudent student = convertToObj(rs);
				list.add(student);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public List<ModelStudent> searchByUni(String uni) {
		// TODO Auto-generated method stub
		List<ModelStudent> list = new ArrayList<ModelStudent>();
		Connection connection = DatabaseConnector.DatabaseConnector();
		String searchByUni = "SELECT student.*, university.ten AS 'uniname' FROM student INNER JOIN university ON student.uni = university.id WHERE university.ten LIKE ?;";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(searchByUni);
			preparedStatement.setString(1, "%"+uni+"%");
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				ModelStudent student = convertToObj(rs);
				list.add(student);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public static ModelStudent convertToObj(ResultSet rs) throws SQLException {
		int id = rs.getInt("id");
		String ten = rs.getString("ten");
		int tuoi = rs.getInt("tuoi");
		int maTruong = rs.getInt("uni");
		String tenTruong = rs.getString("uniname");
		ModelStudent student = new ModelStudent();
		student.setId(id);
		student.setTen(ten);
		student.setAge(tuoi);
		ModelUniversity university = new ModelUniversity();
		university.setId(maTruong);
		university.setName(tenTruong);
		student.setUniversity(university);
		return student;
	}

}
