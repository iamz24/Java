package pkg.section15.person.main;

import pkg.section15.person.model.ModelPerson;

public class MainPerson01 {
	public static void main(String[] args) {
		ModelPerson p1 = new ModelPerson(1, "Nguyen Viet Dũng", 22);
		ModelPerson p2 = new ModelPerson(2, "Tran Trong Huy", 30);
		System.out.println(p1.equals(p2));
	}
}
