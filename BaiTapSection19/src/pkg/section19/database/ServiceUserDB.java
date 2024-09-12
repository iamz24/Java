package pkg.section19.database;

import java.util.List;

import com.mysql.cj.x.protobuf.MysqlxCrud.Insert;

import pkg.section19.model.ModelUser;

public interface ServiceUserDB {
	void insert(ModelUser user);
	List<ModelUser> view();
	ModelUser checkUser(int id);
}
