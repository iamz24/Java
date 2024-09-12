package pkg.section7.main.Person;

import java.util.Scanner;

import pkg.section7.model.Person.ModelStudent;
import pkg.section7.model.Person.ModelTeacher;

public class MainPerson {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so luong giao vien: ");
		int slTeacher = sc.nextInt();
		ModelTeacher[] teacher = new ModelTeacher[slTeacher];
		for (int i = 0; i < teacher.length; i++) {
			System.out.println("--------------------------------");
			teacher[i] = new ModelTeacher();
			System.out.println("Nhap thong tin giao vien thu "+(i+1)+":");
			teacher[i].input();
			System.out.println("=> Luu thong tin thanh cong");
		}
		
		System.out.println("===============================");
		System.out.println("Nhap vao so luong hoc sinh: ");
		int slStudent = sc.nextInt();
		ModelStudent[] student = new ModelStudent[slStudent];
		for (int i = 0; i < student.length; i++) {
			System.out.println("----------------------------------");
			student[i] = new ModelStudent();
			System.out.println("Nhap thong tin hoc sinh thu "+(i+1)+":");
			student[i].input();
		}
		
		System.out.println("==============================");
		System.out.println("Danh sach giao vien:");
		for (ModelTeacher modelTeacher : teacher) {
			System.out.println("---------------------------");
			modelTeacher.output();
		}
		
		System.out.println("===============================");
		System.out.println("Danh sach sinh vien:");
		for (ModelStudent modelStudent : student) {
			System.out.println("-------------------------------");
			modelStudent.output();
		}
	}
}
