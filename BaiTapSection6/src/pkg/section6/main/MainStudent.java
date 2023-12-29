package pkg.section6.main;

import java.util.Iterator;
import java.util.Scanner;

import pkg.section6.model.ModelStudent;

public class MainStudent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap vao so luong sinh vien: ");
		int n = sc.nextInt();
		System.out.println("================================");
		System.out.println("Tiến hành nhập liệu");
		ModelStudent[] student = new ModelStudent[n];
		for (int i = 0; i < student.length; i++) {
			System.out.println("------------------------------");
			System.out.println("Nhap thong tin sinh vien thu "+(i+1)+": ");
			student[i].input();
			System.out.println("=> Luu thanh cong sinh vien thu "+(i+1)+".");
		}
		
		System.out.println("===============================");
		System.out.println("Danh sach sinh vien: ");
		for (ModelStudent modelStudent : student) {
			System.out.println("-------------------------------");
			modelStudent.output();
		}
		
		for (int i = 0; i < student.length-1; i++) {
			ModelStudent dem = student[i];
			for (int j = i+1; j < student.length; j++) {
				if (dem.getAge() > student[j].getAge()) {
					student[i] = student[j];
					student[j] = dem;
					dem = student[i];
				}
			}
		} //ket thuc vong for nay thi student được sắp xếp từ bé đến lớn
		// nên là max sẽ nằm ở index cuối cùng index cuối = length -1
		// vì index chạy từ 0
		System.out.println("=====================================");
		System.out.println("Sinh vien co tuoi lon nhat la: ");
		System.out.println("-------------------------------------");
		student[n-1].output(); 
		
		System.out.println("======================================");
		System.out.println("Sap xep thu tu sinh vien tang dan theo tuoi:");
		for (ModelStudent max : student) {
			System.out.println("------------------------------------");
			max.output();
		}
	}
}
