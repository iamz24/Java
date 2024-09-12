package pkg.section15.person.main;

import java.util.List;

import pkg.section15.imp.ImpListExam;
import pkg.section15.person.model.ModelPerson;

public class MainListExam {
	public static void main(String[] args) {
		ImpListExam impListExam = new ImpListExam();
		
		List<ModelPerson> list = impListExam.inputList();
		System.out.println("----------------------------");
		impListExam.inforList(list);
		System.out.println("----------------------------");
		impListExam.sortList(list);
		System.out.println("----------------------------");
		impListExam.deleteList(list);
		System.out.println("---------------END---------------");
	}
}
