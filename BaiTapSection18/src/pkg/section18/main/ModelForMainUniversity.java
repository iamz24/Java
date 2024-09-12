package pkg.section18.main;

import java.util.List;
import java.util.Scanner;

import com.mysql.cj.xdevapi.DbDoc;

import pkg.section18.database.ImpUniversityDB;
import pkg.section18.imp.ImpUniversity;
import pkg.section18.model.ModelUniversity;

public class ModelForMainUniversity {
	
	public static void menu() {
		while(true) {
			System.out.println("Menu: ");
			System.out.println("1. Them du lieu");
			System.out.println("2. Sua du lieu");
			System.out.println("3. Tim kiem theo id");
			System.out.println("4. Tim kiem theo ten");
			System.out.println("5. Xoa du lieu");
			System.out.println("6. Thoat");
			int choice = new Scanner(System.in).nextInt();
			if (choice == 1) {
				insertModel();
			} else if (choice == 2) {
				updateModel();
			} else if (choice == 3) {
				getIfModel();
			} else if (choice == 4) {
				search();
			} else if (choice == 5) {
				deleteModel();
			} else if (choice == 6) {
				System.out.println("Thanks for using!");
				break;
			} else {
				System.out.println("Khong co lua chon nay, moi chon lai:");
				continue;
			}

		}
	}
	
	public static void insertModel() {
		ImpUniversity impUniversity = new ImpUniversity();
		ModelUniversity university = new ModelUniversity();
		ImpUniversityDB db = new ImpUniversityDB();
		
		impUniversity.input(university);
		db.insert(university);
	}
	
	public static void updateModel() {
		ImpUniversity impUniversity = new ImpUniversity();
		ModelUniversity university = new ModelUniversity();
		ImpUniversityDB db = new ImpUniversityDB();
		System.out.println("Nhap id muon sua du lieu:");
		int id = new Scanner(System.in).nextInt();
		university.setId(id);
		impUniversity.input(university);
		db.update(university);
	}
	
	public static void deleteModel() {
		ImpUniversityDB db = new ImpUniversityDB();
		System.out.println("Nhap id muon xoa: ");
		int id = new Scanner(System.in).nextInt();
		db.delete(id);
	}
	
	public static void getIfModel() {
		ImpUniversity impUniversity = new ImpUniversity();
		ModelUniversity university = new ModelUniversity();
		ImpUniversityDB db = new ImpUniversityDB();
		System.out.println("Nhap id can tim: ");
		int id = new Scanner(System.in).nextInt();
		if (db.getIf(id) != null) {
			impUniversity.info(db.getIf(id));
		} else {
			System.out.println("Khong ton tai id vua nhap!");
		}
	}
	
	public static void search() {
		ImpUniversity impUniversity = new ImpUniversity();
		ImpUniversityDB db = new ImpUniversityDB();
		System.out.println("Nhap ten muon tim: ");
		String key = new Scanner(System.in).nextLine();
		List<ModelUniversity> list = db.search(key);
		if (list.isEmpty()) {
			System.out.println("Khong ton tai ten nguoi dung nay!");
		} else {
			for (ModelUniversity modelUniversity : list) {
				impUniversity.info(modelUniversity);
			}
		}
	}
}
