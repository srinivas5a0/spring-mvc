package rcc.services;

import java.util.List;

import rcc.models.User;

public interface IUserService {

	public void AddUser(User user);
	public List<User> GetAllUsers();
	
}
