package pkg.section19.database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import pkg.section19.model.ModelBill;
import pkg.section19.model.ModelProduct;
import pkg.section19.model.ModelUser;

public class ImpBillDB implements ServiceBillDB {

	@Override
	public void insert(ModelBill bill) {
		// TODO Auto-generated method stub
		 Connection connection = DatabaseConnector.databaseConnector();
		 String insertCmd = "INSERT INTO bill(soluong, dongia, buydate, productid, userid) VALUES (?,?,?,?,?)";
		 try {
			PreparedStatement preparedStatement = connection.prepareStatement(insertCmd, Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setInt(1, bill.getQuantity());
			preparedStatement.setInt(2, bill.getPrice());
			Date date = new Date(bill.getBuyDate().getTime()); // chuyển từ date của java sang date của sql
			preparedStatement.setDate(3, date);
			preparedStatement.setInt(4, bill.getProduct().getId());
			preparedStatement.setInt(5, bill.getBuyer().getId());
			preparedStatement.executeUpdate();
			ResultSet rs = preparedStatement.getGeneratedKeys();
			while (rs.next()) {
				int id = rs.getInt(1);
				bill.setId(id);
			}
			
			//khi add sẽ update cái hàm bên product để trừ đi số lượng hàng
			int after = bill.getProduct().getQuantity() - bill.getQuantity();
			ImpProductDB productDB = new ImpProductDB();
			productDB.updateQuantity(bill.getProduct().getId(), after);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

	@Override
	public ModelBill searchById(int id) {
		// TODO Auto-generated method stub
		Connection connection = DatabaseConnector.databaseConnector();
		String searchByIdCmd = "SELECT bill.*, product.ten AS 'mat_hang', khach_hang.ten AS 'khach_hang' FROM bill INNER JOIN product ON bill.productid = product.id INNER JOIN khach_hang ON bill.userid = khach_hang.id WHERE bill.id = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(searchByIdCmd);
			preparedStatement.setInt(1, id);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				ModelBill bill = convertToObj(rs);
				return bill;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static ModelBill convertToObj(ResultSet rs) throws SQLException {
		int billId = rs.getInt("id");
		int soluong = rs.getInt("soluong");
		int dongia = rs.getInt("dongia");
		java.util.Date date = rs.getDate("buydate");
		int proId = rs.getInt("productid");
		int userId = rs.getInt("userid");
		String productName = rs.getString("mat_hang");
		String userName = rs.getString("khach_hang");
		
		ModelBill bill = new ModelBill();
		bill.setId(billId);
		bill.setQuantity(soluong);
		bill.setPrice(dongia);
		bill.setBuyDate(date);
		ModelUser user = new ModelUser();
		user.setId(userId);
		user.setName(userName);
		ModelProduct product = new ModelProduct();
		product.setId(proId);
		product.setName(productName);
		
		bill.setBuyer(user);
		bill.setProduct(product);
		return bill;
	}

	@Override
	public List<ModelBill> searchByDate(java.util.Date date) {
		// TODO Auto-generated method stub
		List<ModelBill> list = new ArrayList<ModelBill>();
		Connection connection = DatabaseConnector.databaseConnector();
		String searchByDateCmd = "SELECT bill.*, product.ten AS 'mat_hang', khach_hang.ten AS 'khach_hang' FROM bill INNER JOIN product ON bill.productid = product.id INNER JOIN khach_hang ON bill.userid = khach_hang.id WHERE bill.buydate = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(searchByDateCmd);
			Date dateSql = new Date(date.getTime());
			preparedStatement.setDate(1, dateSql);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				ModelBill bill = convertToObj(rs);
				list.add(bill);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

}
