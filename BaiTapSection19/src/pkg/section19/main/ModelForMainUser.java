package pkg.section19.main;

import java.util.List;
import java.util.Scanner;

import pkg.section19.database.ImpUserDB;
import pkg.section19.imp.ImpUser;
import pkg.section19.model.ModelUser;

public class ModelForMainUser {
	public static void menu() {
		while(true) {
			System.out.println("Menu User: ");
			System.out.println("1. Them user");
			System.out.println("2. Hien danh sach user");
			System.out.println("3. Thoat");
			int choice = new Scanner(System.in).nextInt();
			if (choice == 1) {
				insertModel();
			} else if (choice == 2) {
				viewModel();
			} else if (choice == 3) {
				System.out.println("Thanks for using!");
				break;
			} else {
				System.out.println("Khong ton tai lua chon, moi chon lai!");
				continue;
			}
		}
	}
	
	public static void insertModel() {
		ImpUserDB db = new ImpUserDB();
		ImpUser impUser = new ImpUser();
		ModelUser user = new ModelUser();
		
		impUser.input(user);;
		db.insert(user);
	}
	
	public static void viewModel() {
		ImpUserDB db = new ImpUserDB();
		ImpUser impUser = new ImpUser();
		List<ModelUser> listU = db.view();
		if (listU.isEmpty()) {
			System.out.println("Danh sach trong!");
		} else {
			for (ModelUser modelUser : listU) {
				impUser.info(modelUser);
			}
		}
	}
}
