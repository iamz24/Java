package pkg.section15.service;

import java.util.List;

import pkg.section15.person.model.ModelPerson;

public interface ServiceListExam {
	List<ModelPerson> inputList();
	void inforList(List<ModelPerson> list);
	void filterList(List<ModelPerson> list);
	void deleteList(List<ModelPerson> list);
	void sortList(List<ModelPerson> list);
}
