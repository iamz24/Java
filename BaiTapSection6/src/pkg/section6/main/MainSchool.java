package pkg.section6.main;

import java.util.Scanner;

import pkg.section6.model.ModelSchool;

public class MainSchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số trường muốn ghi: ");
		int n = sc.nextInt();
		ModelSchool[] school = new ModelSchool[n];
		for (int i = 0; i < school.length; i++) {
			school[i] = new ModelSchool();
			System.out.println("Nhap thong tin truong thu "+(i+1)+": ");
			school[i].input();
			System.out.println("Da luu thong tin truong so: "+(i+1));
		}
		
		System.out.println("========================");
		System.out.println("Danh sach truong vua nhap");
		
		for (ModelSchool modelSchool : school) {
			modelSchool.output();
		}
		sc.nextLine(); // xóa dấu enter trong bộ nhớ đệm sau for
		
		System.out.println("========================");
		System.out.println("Nhap vao chu tim kiem: ");
		String timKiem = sc.nextLine();
		System.out.println("Ket qua tim kiem la: ");
		int a=0;
		for (int i = 0; i < school.length; i++) {
			if (school[i].getName().contains(timKiem)) {
				school[i].output();
			} else {
				a++;
			}
		}
		if (a == school.length) {
			System.out.println("Khong co truong nao phu hop voi tim kiem");
		}
		
	}

}
