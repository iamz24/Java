package pkg.section10.person.main;

import pkg.section10.person.model.ModelBoss;
import pkg.section10.person.model.ModelEmployee;

public class MainPerson {
	public static void main(String[] args) {
		ModelBoss boss = new ModelBoss();
		ModelEmployee emp = new ModelEmployee();
		
		boss.salary();
		emp.salary();
	}
}
