package pkg.section18.database;

import java.util.List;

import pkg.section18.model.ModelStudent;

public interface ServiceStudentDB {
	void insert(ModelStudent student);
	void update(ModelStudent student);
	void delete(int id);
	ModelStudent searchById(int id);
	List<ModelStudent> searchByAge (int age);
	List<ModelStudent> searchByName (String name);
	List<ModelStudent> searchByUni (String uni);
}
