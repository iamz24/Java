package pkg.section19.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import pkg.section19.model.ModelCategory;
import pkg.section19.model.ModelProduct;

public class ImpProductDB implements ServiceProductDB {

	@Override
	public void insert(ModelProduct product) {
		// TODO Auto-generated method stub
		Connection connection = DatabaseConnector.databaseConnector();
		String insertCmd = "INSERT INTO product(ten, soluong, dongia, categoryid) VALUES (?,?,?,?);";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(insertCmd, Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, product.getName());
			preparedStatement.setInt(2, product.getQuantity());
			preparedStatement.setInt(3, product.getPrice());
			preparedStatement.setInt(4, product.getCategory().getId());
			preparedStatement.executeUpdate();
			ResultSet rs = preparedStatement.getGeneratedKeys();
			while(rs.next()) {
				int id = rs.getInt(1);
				product.setId(id);
			}
			System.out.println("Them san pham thanh cong!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void update(ModelProduct product) {
		// TODO Auto-generated method stub
		Connection connection = DatabaseConnector.databaseConnector();
		String updateCmd = "UPDATE product SET ten = ?, soluong = ?, dongia = ?, categoryid = ? WHERE id = ?;";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(updateCmd);
			preparedStatement.setString(1, product.getName());
			preparedStatement.setInt(2, product.getQuantity());
			preparedStatement.setInt(3, product.getPrice());
			preparedStatement.setInt(4, product.getCategory().getId());
			preparedStatement.setInt(5, product.getId());
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
		String deleteCmd = "DELETE FROM product WHERE id = ?;";
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
	public List<ModelProduct> searchByName(String name) {
		// TODO Auto-generated method stub
		List<ModelProduct> list = new ArrayList<ModelProduct>();
		Connection connection = DatabaseConnector.databaseConnector();
		String searchByNameCmd = "SELECT product.*, category.ten AS 'danhmuc' FROM product INNER JOIN category ON product.categoryid = category.id WHERE product.ten LIKE ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(searchByNameCmd);
			preparedStatement.setString(1, "%"+name+"%");
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				ModelProduct product = convertToObj(rs);
				list.add(product);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
	}

	@Override
	public List<ModelProduct> searchByPrice(int minPrice, int maxPrice) {
		// TODO Auto-generated method stub
		List<ModelProduct> list = new ArrayList<ModelProduct>();
		Connection connection = DatabaseConnector.databaseConnector();
		String searchByPriceCmd = "SELECT product.*, category.ten AS 'danhmuc' FROM product INNER JOIN category ON product.categoryid = category.id WHERE product.dongia BETWEEN ? AND ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(searchByPriceCmd);
			preparedStatement.setInt(1, minPrice);
			preparedStatement.setInt(2, maxPrice);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				ModelProduct product = convertToObj(rs);
				list.add(product);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public List<ModelProduct> searchByCategory(String categoryName) {
		// TODO Auto-generated method stub
		List<ModelProduct> list = new ArrayList<ModelProduct>();
		Connection connection = DatabaseConnector.databaseConnector();
		String searchByCategoryCmd = "SELECT product.*, category.ten AS 'danhmuc' FROM product INNER JOIN category ON product.categoryid = category.id WHERE category.ten LIKE ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(searchByCategoryCmd);
			preparedStatement.setString(1, "%"+categoryName+"%");
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				ModelProduct product = convertToObj(rs);
				list.add(product);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	public static ModelProduct convertToObj(ResultSet rs) throws SQLException {
		int id = rs.getInt("id");
		String ten = rs.getString("ten");
		int soluong = rs.getInt("soluong");
		int dongia = rs.getInt("dongia");
		int categoryId = rs.getInt("categoryid");
		String categoryName = rs.getString("danhmuc");
		
		ModelProduct product = new ModelProduct();
		product.setId(id);
		product.setName(ten);
		product.setQuantity(soluong);
		product.setPrice(dongia);
		
		ModelCategory category = new ModelCategory();
		category.setId(categoryId);
		category.setTen(categoryName);
		product.setCategory(category);
		
		return product;
	}

	@Override
	public ModelProduct checkProduct(int id) {
		// TODO Auto-generated method stub
		Connection connection = DatabaseConnector.databaseConnector();
		String checkProductCmd = "SELECT * FROM product WHERE id = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(checkProductCmd);
			preparedStatement.setInt(1, id);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				ModelProduct product = new ModelProduct();
				product.setId(rs.getInt("id"));
				product.setName(rs.getString("ten"));
				product.setQuantity(rs.getInt("soluong"));
				product.setPrice(rs.getInt("dongia"));
				ModelCategory category = new ModelCategory();
				category.setId(rs.getInt("categoryid"));
				product.setCategory(category);
				return product;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public void updateQuantity(int id, int after) {
		// TODO Auto-generated method stub
		Connection connection = DatabaseConnector.databaseConnector();
		String updateQuantityCmd = "UPDATE product SET soluong = ? WHERE id = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(updateQuantityCmd);
			preparedStatement.setInt(1, after);
			preparedStatement.setInt(2, id);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
