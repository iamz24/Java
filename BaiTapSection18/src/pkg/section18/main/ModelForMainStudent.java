package pkg.section18.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pkg.section18.database.ImpStudentDB;
import pkg.section18.imp.ImpStudent;
import pkg.section18.model.ModelStudent;
import pkg.section18.model.ModelUniversity;

public class ModelForMainStudent {
	public static void menu() {
		while(true) {
			System.out.println("Menu:");
			System.out.println("1. Them sinh vien");
			System.out.println("2. Sua sinh vien");
			System.out.println("3. Xoa sinh vien");
			System.out.println("4. Tim sinh vien theo id");
			System.out.println("5. Tim sinh vien theo ten");
			System.out.println("6. Tim sinh vien theo tuoi");
			System.out.println("7. Tim sinh vien theo truong");
			System.out.println("8. Thoat");
			int choice = new Scanner(System.in).nextInt();
			if (choice == 1) {
				insertModel();
			} else if (choice == 2) {
				updateModel();
			} else if (choice == 3) {
				deleteModel();
			} else if (choice == 4) {
				searchByIdModel();
			} else if (choice ==5) {
				searchByNameModel();
			} else if (choice == 6) {
				searchByAgeModel();
			} else if (choice == 7) {
				searchByUniModel();
			} else if (choice == 8) {
				System.out.println("Thanks for using!");
				break;
			} else {
				System.out.println("Khong ton tai lua chon, moi chon lai!");
				continue;
			}
		}
	}
	
	public static void insertModel() {
		ModelStudent student = new ModelStudent();
		ImpStudentDB db = new ImpStudentDB();
		ImpStudent impStudent = new ImpStudent();
		impStudent.input(student);
		db.insert(student);
	}
	
	public static void updateModel() {
		ModelStudent student = new ModelStudent();
		ImpStudentDB db = new ImpStudentDB();
		ImpStudent impStudent = new ImpStudent();
		System.out.println("Nhap id sinh vien muon sua: ");
		student.setId(new Scanner(System.in).nextInt());
		impStudent.input(student);
		db.update(student);
	}
	
	public static void deleteModel() {
		ImpStudentDB db = new ImpStudentDB();
		System.out.println("Nhap id sinh vien muon xoa: ");
		int id = new Scanner(System.in).nextInt();
		db.delete(id);
	}
	
	public static void searchByIdModel() {
		ModelStudent student = new ModelStudent();
		ImpStudentDB db = new ImpStudentDB();
		ImpStudent impStudent = new ImpStudent();
		System.out.println("Nhap id cua sinh vien can tim: ");
		int id = new Scanner(System.in).nextInt();
		student = db.searchById(id);
		if (student != null) {
			impStudent.info(student);
		} else {
			System.out.println("Khong tim thay id!");
		}
	}
	
	public static void searchByNameModel() {
		ImpStudentDB db = new ImpStudentDB();
		ImpStudent impStudent = new ImpStudent();
		System.out.println("Nhap ten muon tim: ");
		String name = new Scanner(System.in).nextLine();
		List<ModelStudent> listSt = db.searchByName(name);
		if (listSt.isEmpty()) {
			System.out.println("Khong ton tai ten vua tim!");
		} else {
			for (ModelStudent modelStudent : listSt) {
				impStudent.info(modelStudent);
			}
		}
	}
	
	public static void searchByAgeModel() {
		ImpStudentDB db = new ImpStudentDB();
		ImpStudent impStudent = new ImpStudent();
		System.out.println("Nhap so tuoi muon tim: ");
		int age = new Scanner(System.in).nextInt();
		List<ModelStudent> listSt = db.searchByAge(age);
		if (listSt.isEmpty()) {
			System.out.println("Khong co so tuoi yeu cau!");
		} else {
			for (ModelStudent modelStudent : listSt) {
				impStudent.info(modelStudent);
			}
		}
	}
	
	public static void searchByUniModel() {
		ImpStudentDB db = new ImpStudentDB();
		ImpStudent impStudent = new ImpStudent();
		System.out.println("Nhap ten truong muon tim: ");
		String uni = new Scanner(System.in).nextLine();
		List<ModelStudent> listSt = db.searchByUni(uni);
		if (listSt.isEmpty()) {
			System.out.println("Khong ton tai ten truong vua tim!");
		} else {
			for (ModelStudent modelStudent : listSt) {
				impStudent.info(modelStudent);
			}
		}
	}
	
}
