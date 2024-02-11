package pkg.section19.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import pkg.section19.database.ImpBillDB;
import pkg.section19.imp.ImpBill;
import pkg.section19.model.ModelBill;

public class ModelForMainBill {
	public static void menu() {
		while (true) {
			System.out.println("Menu Bill: ");
			System.out.println("1. Them hoa don");
			System.out.println("2. Tim hoa don theo id");
			System.out.println("3. Tim hoa don theo ngay tao");
			System.out.println("4. Thoat");
			int choice = new Scanner(System.in).nextInt();
			if (choice == 1) {
				insertModel();
			} else if (choice == 2) {
				searchById();
			} else if (choice == 3) {
				searchByDateModel();
			} else if (choice == 4) {
				System.out.println("Thanks for using!");
				break;
			} else {
				System.out.println("Khong ton tai lua chon, moi chon lai!");
				continue;
			}
		}
	}
	
	public static void insertModel() {
		ImpBillDB billDB = new ImpBillDB();
		ImpBill impBill = new ImpBill();
		ModelBill bill = new ModelBill();
		
		impBill.input(bill);
		billDB.insert(bill);
	}
	
	public static void searchById() {
		ImpBillDB billDB = new ImpBillDB();
		ImpBill impBill = new ImpBill();
		ModelBill bill = new ModelBill();
		System.out.println("Nhap ma hoa don can tim: ");
		int id = new Scanner(System.in).nextInt();
		bill = billDB.searchById(id);
		if (bill != null) {
			impBill.info(bill);
		} else {
			System.out.println("Khong co hoa don can tim!");
		}
	}
	
	public static void searchByDateModel() {
		ImpBillDB billDB = new ImpBillDB();
		ImpBill impBill = new ImpBill();
		
		while (true) {
			System.out.println("Nhap ngay lap hoa don can tim: ");
			String date = new Scanner(System.in).nextLine();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			try {
				Date dateFormated = dateFormat.parse(date);
				List<ModelBill> listBill = billDB.searchByDate(dateFormated);
				if (listBill.isEmpty()) {
					System.out.println("Khong co hoa don nao duoc lap trong ngay tren!");
					break;
				} else {
					for (ModelBill modelBill : listBill) {
						impBill.info(modelBill);
					}
					break;
				}
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				System.out.println("Dinh dang ngay bi loi, moi nhap lai!");;
			}
		}
	}
}
