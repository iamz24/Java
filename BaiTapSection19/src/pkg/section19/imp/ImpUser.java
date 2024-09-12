package pkg.section19.imp;

import java.util.Scanner;

import pkg.section19.model.ModelUser;
import pkg.section19.service.ServiceUser;

public class ImpUser implements ServiceUser {

	@Override
	public void input(ModelUser user) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten user: ");
		user.setName(sc.nextLine());
		System.out.println("Nhap dia chi: ");
		user.setAddress(sc.nextLine());
	}

	@Override
	public void info(ModelUser user) {
		// TODO Auto-generated method stub
		System.out.println("ID: "+user.getId());
		System.out.println("Ten: "+user.getName());
		System.out.println("Dia chi: "+user.getAddress());
	}

}
