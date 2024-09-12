package pkg.section16.set.main;

import java.util.Set;

import pkg.section16.set.imp.ImpPerson;
import pkg.section16.set.imp.ImpSet;
import pkg.section16.set.model.ModelPerson;

public class MainSetPerson {
	public static void main(String[] args) {
		ImpSet impSet = new ImpSet();
		Set<ModelPerson> setPerson = impSet.inputList();
		impSet.infoList(setPerson);
		impSet.filter(setPerson);
		impSet.delete(setPerson);
	}
}
