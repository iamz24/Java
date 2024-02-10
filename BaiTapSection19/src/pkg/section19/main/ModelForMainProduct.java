package pkg.section19.main;

import java.util.List;
import java.util.Scanner;

import pkg.section19.database.ImpProductDB;
import pkg.section19.imp.ImpProduct;
import pkg.section19.model.ModelProduct;

public class ModelForMainProduct {
	public static void menu() {
		while (true) {
			System.out.println("Menu Product:");
			System.out.println("1. Them san pham");
			System.out.println("2. Sua san pham");
			System.out.println("3. Xoa san pham");
			System.out.println("4. Loc san pham theo ten");
			System.out.println("5. Loc san pham theo gia");
			System.out.println("6. Loc san pham theo danh muc");
			System.out.println("7. Thoat");
			int choice = new Scanner(System.in).nextInt();
			if (choice == 1) {
				insertModel();
			} else if (choice == 2) {
				updateModel();
			} else if (choice == 3) {
				deleteModel();
			} else if (choice == 4) {
				searchByNameModel();
			} else if (choice == 5) {
				searchByPriceModel();
			} else if (choice == 6) {
				searchByCategoryModel();
			} else if (choice == 7) {
				System.out.println("Thanks for using!");
				break;
			} else {
				System.out.println("Khong ton tai lua chon, moi chon lai!");
			}
		}
	}
	
	public static void insertModel() {
		ImpProductDB db = new ImpProductDB();
		ImpProduct impProduct = new ImpProduct();
		ModelProduct product = new ModelProduct();
		
		impProduct.input(product);
		db.insert(product);
	}
	
	public static void updateModel() {
		ImpProductDB db = new ImpProductDB();
		ImpProduct impProduct = new ImpProduct();
		ModelProduct product = new ModelProduct();
		
		System.out.println("Nhap id san pham can sua: ");
		int id = new Scanner(System.in).nextInt();
		product.setId(id);
		impProduct.input(product);
		db.update(product);
	}
	
	public static void deleteModel() {
		ImpProductDB db = new ImpProductDB();
		System.out.println("Nhap id san pham can xoa: ");
		int id = new Scanner(System.in).nextInt();
		db.delete(id);
	}
	
	public static void searchByNameModel() {
		ImpProductDB db = new ImpProductDB();
		ImpProduct impProduct = new ImpProduct();
		
		System.out.println("Nhap ten san pham can tim: ");
		String name = new Scanner(System.in).nextLine();
		List<ModelProduct> listPr = db.searchByName(name);
		if (listPr.isEmpty()) {
			System.out.println("Khong co ten san pham vua tim!");
		} else {
			for (ModelProduct modelProduct : listPr) {
				impProduct.info(modelProduct);
			}
		}
	}
	
	public static void searchByPriceModel() {
		ImpProductDB db = new ImpProductDB();
		ImpProduct impProduct = new ImpProduct();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap gia min: ");
		int minPrice = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap gia max: ");
		int maxPrice = sc.nextInt();
		List<ModelProduct> listPr = db.searchByPrice(minPrice, maxPrice);
		if (listPr.isEmpty()) {
			System.out.println("Khong co san pham nao trong khoang gia nay!");
		} else {
			for (ModelProduct modelProduct : listPr) {
				impProduct.info(modelProduct);
			}
		}
	}
	
	public static void searchByCategoryModel() {
		ImpProductDB db = new ImpProductDB();
		ImpProduct impProduct = new ImpProduct();
		
		System.out.println("Nhap ten danh muc san pham can tim: ");
		String categoryName = new Scanner(System.in).nextLine();
		List<ModelProduct> listPr = db.searchByCategory(categoryName);
		if (listPr.isEmpty()) {
			System.out.println("Danh muc ban vua nhap khong co mat hang!");
		} else {
			for (ModelProduct modelProduct : listPr) {
				impProduct.info(modelProduct);
			}
		}
	}
}
