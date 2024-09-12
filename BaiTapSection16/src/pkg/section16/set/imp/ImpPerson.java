package pkg.section16.set.imp;

import java.util.Scanner;

import pkg.section16.set.model.ModelPerson;
import pkg.section16.set.service.ServicePerson;

public class ImpPerson implements ServicePerson {

	@Override
	public void inputPerson(ModelPerson p) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap id: ");
		p.setId(sc.nextInt());
		sc.nextLine();
		System.out.println("Nhap ten: ");
		p.setName(sc.nextLine());
		System.out.println("Nhap tuoi: ");
		p.setAge(sc.nextInt());
		sc.nextLine();
	}

	@Override
	public void infoPerson(ModelPerson p) {
		// TODO Auto-generated method stub
		System.out.println("ID: "+p.getId());
		System.out.println("Ten: "+p.getName());
		System.out.println("Tuoi: "+p.getAge());
	}

}
