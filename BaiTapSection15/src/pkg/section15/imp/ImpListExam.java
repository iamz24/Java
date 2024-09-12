package pkg.section15.imp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import pkg.section15.person.model.ModelPerson;
import pkg.section15.service.ServiceListExam;
import pkg.section15.service.ServicePerson;

public class ImpListExam implements ServiceListExam{
	ImpPerson impPerson = new ImpPerson();

	@Override
	public List<ModelPerson> inputList() {
		List<ModelPerson> listPerson = new ArrayList<ModelPerson>(); // nếu dùng hàm void thì phải khai báo list bên ngoài
		
		while(true) {
			ModelPerson person = new ModelPerson();
			impPerson.inputPerson(person);
			listPerson.add(person);
			
			System.out.println("Press any key to continue or Q to quit");
			String choice = new Scanner(System.in).nextLine();
			if (choice.equals("Q")) {
				break;
			}
		}
		return listPerson;
	}

	@Override
	public void inforList(List<ModelPerson> list) {
		// TODO Auto-generated method stub
		System.out.println("Danh sach:");
		for (ModelPerson modelPerson : list) {
			impPerson.infoPerson(modelPerson);
		}
	}

	@Override
	public void filterList(List<ModelPerson> list) {
		// TODO Auto-generated method stub
		System.out.println("Danh sach duoi 20 tuoi: ");
		for (ModelPerson modelPerson : list) {
			if (modelPerson.getAge()<20) {
				impPerson.infoPerson(modelPerson);;
			}
		}
	}

	@Override
	public void deleteList(List<ModelPerson> list) {
		// TODO Auto-generated method stub
		System.out.println("Danh sach nguoi ten khong co chu A: ");
		Iterator<ModelPerson> itr = list.iterator();
		while(itr.hasNext()) {
			String s = itr.next().getName();
			if (s.contains("a")||s.contains("A")) {
				itr.remove();
			}
		}
		inforList(list);
	}

	@Override
	public void sortList(List<ModelPerson> list) {
		// TODO Auto-generated method stub
		System.out.println("Tuoi giam dan: ");
		Collections.sort(list, new Comparator<ModelPerson>() {
			@Override
			public int compare(ModelPerson o1, ModelPerson o2) {
				if (o1.getAge() - o2.getAge() < 0) {
					return -1;
				} else if (o1.getAge() - o2.getAge() > 0) {
					return 1;
				} else {
					return 0;
				}
			}	
		});
		inforList(list);
		
		System.out.println("Tuoi tang dan: ");
		Collections.sort(list, new Comparator<ModelPerson>() {
			@Override
			public int compare(ModelPerson o1, ModelPerson o2) {
				if (o1.getAge() - o2.getAge() < 0) {
					return 1;
				} else if (o1.getAge() - o2.getAge() > 0) {
					return -1;
				} else {
					return 0;
				}
			}	
		});
		inforList(list);
	}
	
	
	

	
}
