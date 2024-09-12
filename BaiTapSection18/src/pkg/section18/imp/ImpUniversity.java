package pkg.section18.imp;

import java.util.Scanner;

import pkg.section18.model.ModelUniversity;
import pkg.section18.service.ServiceUniversity;

public class ImpUniversity implements ServiceUniversity {

	@Override
	public void input(ModelUniversity uni) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten truong: ");
		uni.setName(sc.nextLine());
		System.out.println("Nhap dia chi: ");
		uni.setAddress(sc.nextLine());
		
	}

	@Override
	public void info(ModelUniversity uni) {
		// TODO Auto-generated method stub
		System.out.println("Ma truong: "+uni.getId());
		System.out.println("Ten truong: "+uni.getName());
		System.out.println("Dia chi: "+uni.getAddress());
	}
	
}
