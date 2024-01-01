package pkg.section10.student.imp;

import java.util.Scanner;

import pkg.section10.student.model.ModelAddress;
import pkg.section10.student.service.ServiceAddress;

public class ImplementAddress implements ServiceAddress {

	@Override
	public void input(ModelAddress add) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so nha: ");
		add.setSoNha(sc.nextLine());
		System.out.println("Nhap vao ten duong: ");
		add.setStreet(sc.nextLine());
		System.out.println("Nhap vao thanh pho: ");
		add.setCity(sc.nextLine());
	}

	@Override
	public void output(ModelAddress add) {
		// TODO Auto-generated method stub
		System.out.println("So nha: "+add.getSoNha());
		System.out.println("Ten duong: "+add.getStreet());
		System.out.println("Thanh pho: "+add.getCity());
	}

}
