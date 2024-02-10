package pkg.section19.database;

import pkg.section19.model.ModelCategory;

public interface ServiceCategoryDB {
	void insert(ModelCategory category);
	void update(ModelCategory category);
	void delete(int id);
	ModelCategory checkCategory(int id);
}
