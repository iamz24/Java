package pkg.section16.set.imp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import pkg.section16.set.model.ModelPerson;
import pkg.section16.set.service.ServiceSet;

public class ImpSet implements ServiceSet {
	ImpPerson impPerson = new ImpPerson();
	
	@Override
	public Set<ModelPerson> inputList() {
		Set<ModelPerson> setPerson = new HashSet<ModelPerson>();
		System.out.println("Nhap du lieu: ");
		while(true) {
			ModelPerson person = new ModelPerson();
			impPerson.inputPerson(person);
			setPerson.add(person);
			System.out.println("Press any key to continue or Q to quit");
			Scanner sc = new Scanner(System.in);
			String choice=sc.nextLine();
			if (choice.equals("Q")) {
				break;
			}
		}
		
		return setPerson;
	}

	@Override
	public void infoList(Set<ModelPerson> setPerson) {
		// TODO Auto-generated method stub
		System.out.println("Danh sach: ");
		for (ModelPerson modelPerson : setPerson) {
			impPerson.infoPerson(modelPerson);
		}
	}

	@Override
	public void filter(Set<ModelPerson> setPerson) {
		// TODO Auto-generated method stub
		System.out.println("Danh sach nguoi duoi 20 tuoi: ");
		for (ModelPerson modelPerson : setPerson) {
			if (modelPerson.getAge() < 20) {
				impPerson.infoPerson(modelPerson);;
			}
		}

	}

	@Override
	public void delete(Set<ModelPerson> setPerson) {
		// TODO Auto-generated method stub
		System.out.println("Xoa nguoi ten co chu A: ");
		Iterator<ModelPerson> itr = setPerson.iterator();
		while(itr.hasNext()) {
			String s = itr.next().getName();
			if (s.contains("A") || s.contains("a")) {
				itr.remove();
				impPerson.infoPerson(itr.next());
			}
		}
		
	}
	
	

}
