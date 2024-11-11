package dao;

import models.User_22110311;

public interface UserDAO_22110311 {
	
	void addUser(User_22110311 user);
	void updateUser(User_22110311 user);
	void deleteUser(String userId);
	User_22110311 getUserById(String userId);
}
