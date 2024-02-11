package pkg.section19.imp;

import java.util.Scanner;

import pkg.section19.model.ModelCategory;
import pkg.section19.service.ServiceCategory;

public class ImpCategory implements ServiceCategory {

	@Override
	public void input(ModelCategory category) {
		// TODO Auto-generated method stub
		System.out.println("Nhap ten phan loai: ");
		category.setTen(new Scanner(System.in).nextLine());
	}

	@Override
	public void info(ModelCategory category) {
		// TODO Auto-generated method stub
		System.out.println("ID: "+category.getId());
		System.out.println("Phan loai: "+category.getTen());
	}

}
