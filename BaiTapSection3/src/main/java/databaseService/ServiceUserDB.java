package databaseService;

import java.util.List;

import model.User;

public interface ServiceUserDB {
	void insert(User user);
	List<User> getAll();
	void delete (int id);
	void update(User user);
	User searchById(int id);
	List<User> searchByName(String name);
}
