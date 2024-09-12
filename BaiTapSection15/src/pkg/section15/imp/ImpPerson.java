package pkg.section15.imp;

import java.util.Scanner;

import pkg.section15.person.model.ModelPerson;
import pkg.section15.service.ServicePerson;

public class ImpPerson implements ServicePerson{

	@Override
	public void inputPerson(ModelPerson person) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap id: ");
		person.setId(sc.nextInt());
		sc.nextLine();
		System.out.println("Nhap ten: ");
		person.setName(sc.nextLine());
		System.out.println("Nhap tuoi: ");
		person.setAge(sc.nextInt());
	}

	@Override
	public void infoPerson(ModelPerson person) {
		// TODO Auto-generated method stub
		System.out.println("ID: "+person.getId());
		System.out.println("Name: "+person.getName());
		System.out.println("Age: "+person.getAge());
	}

	

}
