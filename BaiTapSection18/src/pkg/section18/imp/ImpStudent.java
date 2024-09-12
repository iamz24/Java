package pkg.section18.imp;

import java.util.Scanner;

import pkg.section18.model.ModelStudent;
import pkg.section18.model.ModelUniversity;
import pkg.section18.service.ServiceStudent;

public class ImpStudent implements ServiceStudent{

	@Override
	public void input(ModelStudent student) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten sinh vien: ");
		student.setTen(sc.nextLine());
		System.out.println("Nhap tuoi sinh vien: ");
		student.setAge(sc.nextInt());
		sc.nextLine(); // xóa dấu xuống dòng
		System.out.println("Nhap id truong dai hoc: ");
		ModelUniversity university = new ModelUniversity();
		university.setId(sc.nextInt());
		student.setUniversity(university);
	}

	@Override
	public void info(ModelStudent student) {
		// TODO Auto-generated method stub
		System.out.println("ID: "+student.getId());
		System.out.println("Ho va ten: "+student.getTen());
		System.out.println("Tuoi: "+student.getAge());
		System.out.println("Truong dai hoc: "+student.getUniversity().getName());
		System.out.println("Ma truong: "+student.getUniversity().getId());
	}

}
