package pkg.section19.main;

import java.util.Scanner;

import pkg.section19.database.ImpCategoryDB;
import pkg.section19.imp.ImpCategory;
import pkg.section19.model.ModelCategory;

public class ModelForMainCategory {
	public static void menu() {
		while(true) {
			System.out.println("Menu Category:");
			System.out.println("1. Them phan loai");
			System.out.println("2. Sua phan loai");
			System.out.println("3. Xoa phan loai");
			System.out.println("4. Thoat");
			int choice = new Scanner(System.in).nextInt();
			if (choice == 1) {
				insertModel();;
			} else if (choice == 2) {
				updateModel();;
			} else if (choice == 3) {
				deleteModel();;
			} else if (choice == 4) {
				System.out.println("Thanks for using!");
				break;
			} else {
				System.out.println("Lua chon khong ton tai, moi chon lai!");
				continue;
			}
		}
	}
	
	public static void insertModel() {
		ImpCategory impCategory = new ImpCategory();
		ModelCategory category = new ModelCategory();
		ImpCategoryDB db = new ImpCategoryDB();
		impCategory.input(category);
		db.insert(category);
	}
	
	public static void updateModel() {
		ImpCategory impCategory = new ImpCategory();
		ModelCategory category = new ModelCategory();
		ImpCategoryDB db = new ImpCategoryDB();
		System.out.println("Nhap id cua phan loai muon sua: ");
		int id = new Scanner(System.in).nextInt();
		category.setId(id);
		impCategory.input(category);
		db.update(category);
	}
	
	public static void deleteModel() {
		ImpCategoryDB db = new ImpCategoryDB();
		System.out.println("Nhap id cua phan loai can xoa: ");
		int id = new Scanner(System.in).nextInt();
		db.delete(id);
	}
}
