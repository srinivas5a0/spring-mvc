package rcc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rcc.data.UserRepository;
import rcc.models.User;

@Service
public class UserServiceImpl implements IUserService {

	private final UserRepository userRepo;
	
	@Autowired
	public UserServiceImpl(UserRepository _userRepo){
		this.userRepo = _userRepo;
	}
	
	public void AddUser(User user){
		
		userRepo.save(user);
	}
	
	public List<User> GetAllUsers(){
		
		return (List<User>) userRepo.findAll();
	}
}
