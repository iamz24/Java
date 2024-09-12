package pkg.section18.database;

import java.util.List;

import pkg.section18.model.ModelUniversity;

public interface ServiceUniversityDB {
	void insert(ModelUniversity university);
	void update(ModelUniversity university);
	void delete(int id);
	ModelUniversity getIf(int id);
	List<ModelUniversity> search(String name);
}
