package pkg.section10.student.imp;

import java.util.Scanner;

import pkg.section10.student.model.ModelSchool;
import pkg.section10.student.service.ServiceSchool;

public class ImplementSchool implements ServiceSchool{

	@Override
	public void input(ModelSchool sch) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma truong: ");
		sch.setId(sc.nextLine());
		System.out.println("Nhap ten truong: ");
		sch.setName(sc.nextLine());
	}

	@Override
	public void output(ModelSchool sch) {
		// TODO Auto-generated method stub
		System.out.println("Ma truong: "+sch.getId());
		System.out.println("Ten truong: "+sch.getName());
	}

	

}
