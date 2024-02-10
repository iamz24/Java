package pkg.section19.database;

import java.util.List;

import pkg.section19.model.ModelProduct;

public interface ServiceProductDB {
	void insert(ModelProduct product);
	void update(ModelProduct product);
	void delete(int id);
	List<ModelProduct> searchByName(String name);
	List<ModelProduct> searchByPrice(int minPrice, int maxPrice);
	List<ModelProduct> searchByCategory (String categoryName);
	ModelProduct checkProduct(int id);
	void updateQuantity(int id, int after);
}
