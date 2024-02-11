package pkg.section16.set.service;

import java.util.Set;

import pkg.section16.set.model.ModelPerson;

public interface ServiceSet {
	Set<ModelPerson> inputList();
	void infoList (Set<ModelPerson> setPerson);
	void filter(Set<ModelPerson> setPerson);
	void delete (Set<ModelPerson> setPerson);
}
