package databaseService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.User;

public class ImpUserDB implements ServiceUserDB {

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		Connection connection = DatabaseConnector.databaseConnector();
		String completeCmd = "UPDATE kh_2 SET name = ?, age = ? WHERE username = ?;";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(completeCmd, Statement.RETURN_GENERATED_KEYS); //lấy id do id là autoincrement
			preparedStatement.setString(1, user.getName());
			preparedStatement.setInt(2, user.getAge());
			preparedStatement.setString(3, user.getUsername());
			preparedStatement.executeUpdate();
			ResultSet rs = preparedStatement.getGeneratedKeys();
			while(rs.next()) {
				int id = rs.getInt(1);//lấy dữ liệu từ dòng thứ 1 tức là id=1
				user.setId(id);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Connection connection = DatabaseConnector.databaseConnector();
		String deleteCmd = "DELETE FROM kh_2 WHERE id = ?;";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(deleteCmd);
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<User> getAll() {
		List<User> listUser = new ArrayList<User>();
		Connection connection = DatabaseConnector.databaseConnector();
		String getAllCmd = "SELECT * FROM kh_2;";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(getAllCmd);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				User user = convertToObj(rs);
				listUser.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listUser;

		
	}
	
	public static User convertToObj(ResultSet rs) throws SQLException {
		int id = rs.getInt("id");
		String name = rs.getString("name");
		int age = rs.getInt("age");
		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setAge(age);
		return user;
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		User currentUser = searchById(user.getId());
		if (currentUser != null) {
			Connection connection = DatabaseConnector.databaseConnector();
			String updateCmd = "UPDATE kh_2 SET age = ? WHERE id =?";
			try {
				PreparedStatement preparedStatement = connection.prepareStatement(updateCmd);
				currentUser.setAge(user.getAge()); //chèn age mới vào vì từ đầu currentUser đang mang age cũ
				preparedStatement.setInt(1, currentUser.getAge()); //chỗ nầy set thẳng user.getage cũng được vì nó đã là user mới, 
				preparedStatement.setInt(2, currentUser.getId());
				//còn user cũ thằng current mang nên phải set
				preparedStatement.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public User searchById(int id) {
		// TODO Auto-generated method stub
		User user = new User();
		Connection connection = DatabaseConnector.databaseConnector();
		String searchByIdCmd = "SELECT * FROM kh_2 WHERE id = ?"; 
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(searchByIdCmd);
			preparedStatement.setInt(1, id);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setAge(rs.getInt("age"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}

	@Override
	public List<User> searchByName(String name) {
		// TODO Auto-generated method stub
		List<User> user = new ArrayList<User>();
		Connection connection = DatabaseConnector.databaseConnector();
		String searchByNameCmd = "SELECT * FROM kh_2 WHERE name LIKE ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(searchByNameCmd); //lấy id được Auto increment
			preparedStatement.setString(1, "%"+name+"%");
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				User u = convertToObj(rs);
				user.add(u);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}

	@Override
	public User checkAccount(String username, String password) {
		// TODO Auto-generated method stub
		
		Connection connection = DatabaseConnector.databaseConnector();
		String checkAccountCmd = "SELECT * FROM kh_2 WHERE username = ? AND password = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(checkAccountCmd);
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setAge(rs.getInt("age"));
				return user;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		Connection connection = DatabaseConnector.databaseConnector();
		String insertCmd = "INSERT INTO kh_2(name, age, username, password) VALUES (null,null,?,?);";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(insertCmd); //lấy id do id là autoincrement
			preparedStatement.setString(1, user.getUsername());
			preparedStatement.setString(2, user.getPassword()); 
			//không set giá trị cho name và age để set sau, age là int nguyên thủy nên không set mặc định nó nhận 0
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
