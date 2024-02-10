package pkg.section19.imp;

import java.util.Scanner;

import pkg.section19.database.ImpCategoryDB;
import pkg.section19.model.ModelCategory;
import pkg.section19.model.ModelProduct;
import pkg.section19.service.ServiceProduct;

public class ImpProduct implements ServiceProduct{

	@Override
	public void input(ModelProduct product) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten san pham: ");
		product.setName(sc.nextLine());
		System.out.println("Nhap so luong: ");
		product.setQuantity(sc.nextInt());
		sc.nextLine(); //tiêu thụ dấu enter
		System.out.println("Nhap don gia: ");
		product.setPrice(sc.nextInt());
		sc.nextLine();
		while (true) {
			System.out.println("Nhap id danh muc:  ");
			int id = new Scanner(System.in).nextInt();
			ModelCategory category = new ModelCategory();			
			ImpCategoryDB db = new ImpCategoryDB();
			category = db.checkCategory(id);
			product.setCategory(category);
			if (category != null) {
				break;
			} else {
				System.out.println("Khong ton tai id danh muc vua nhap, moi nhap lai!");
				continue;
			}
		}
		
	}

	@Override
	public void info(ModelProduct product) {
		// TODO Auto-generated method stub
		System.out.println("ID: "+product.getId());
		System.out.println("Name: "+product.getName());
		System.out.println("Quantity: "+product.getQuantity());
		System.out.println("Price: "+product.getPrice());
		System.out.println("Category: "+product.getCategory().getTen());
		System.out.println("ID category: "+product.getCategory().getId());
	}
	
}
