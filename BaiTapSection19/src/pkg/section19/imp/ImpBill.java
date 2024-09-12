package pkg.section19.imp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import pkg.section19.database.ImpProductDB;
import pkg.section19.database.ImpUserDB;
import pkg.section19.model.ModelBill;
import pkg.section19.model.ModelProduct;
import pkg.section19.model.ModelUser;
import pkg.section19.service.ServiceBill;

public class ImpBill implements ServiceBill {

	@Override
	public void input(ModelBill bill) {
		// TODO Auto-generated method stub
		ImpProductDB productDB = new ImpProductDB();
		ImpUserDB userDB = new ImpUserDB();
		while(true) {
			System.out.println("Nhap id mat hang: ");
			int id = new Scanner(System.in).nextInt();
			ModelProduct product = productDB.checkProduct(id);
			bill.setProduct(product);
			if (product != null) {
				break;
			} else {
				System.out.println("Id mat hang khong ton tai, moi nhap lai!");
				continue;
			}
		}
		
		while (true) {
			System.out.println("Nhap so luong mua: ");
			int soLuong = new Scanner(System.in).nextInt();
			bill.setQuantity(soLuong);
			if (bill.getQuantity() > bill.getProduct().getQuantity()) {
				System.out.println("So luong vuot qua luong hang trong kho, moi nhap lai!");
				continue; 
			} else {
				break;
			}
		}
		
		bill.setPrice(bill.getProduct().getPrice());
		
		while (true) {
			System.out.println("Nhap id nguoi mua: ");
			int id = new Scanner(System.in).nextInt();
			ModelUser user = userDB.checkUser(id);
			bill.setBuyer(user);
			if (user == null) {
				System.out.println("Khong ton tai user nay, moi nhap lai!");
				continue;
			} else {
				break;
			}
		}
		
		while (true) {
			try {
				System.out.println("Nhap ngay lap bill: ");
				String date = new Scanner(System.in).nextLine();
				String pattern = "dd/MM/yyyy";
				//format string ve dang date de set bien
				SimpleDateFormat format = new SimpleDateFormat(pattern);
				Date dateFormated = format.parse(date);
				bill.setBuyDate(dateFormated);
				break;
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				System.out.println("Dinh dang ngay bi sai hoac khong hop le, moi nhap lai!");
				continue;
			}
		}
	}

	@Override
	public void info(ModelBill bill) {
		// TODO Auto-generated method stub
		System.out.println("ID: "+bill.getId());
		System.out.println("Mat hang: "+bill.getProduct().getName());
		System.out.println("Ma hang: "+bill.getProduct().getId());
		System.out.println("So luong mua: "+bill.getQuantity());
		System.out.println("Don gia: "+bill.getPrice());
		System.out.println("Khach hang: "+bill.getBuyer().getName());
		System.out.println("Ma khach hang: "+bill.getBuyer().getId());
		//format lai date thanh dang dd/MM/yyyy
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Ngay lap hoa don: "+dateFormat.format(bill.getBuyDate()));
	}

}
