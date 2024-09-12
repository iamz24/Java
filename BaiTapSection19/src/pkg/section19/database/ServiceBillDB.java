package pkg.section19.database;

import java.sql.Date;
import java.util.List;

import pkg.section19.model.ModelBill;

public interface ServiceBillDB {
	void insert(ModelBill bill);
	ModelBill searchById (int id);
	List<ModelBill> searchByDate (java.util.Date date);
}
