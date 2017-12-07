package rcc.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import rcc.models.User;
import rcc.services.IUserService;

@Controller
@RequestMapping("/users")
public class UserController {

	private IUserService userService;
	
	@Autowired
	public UserController(IUserService _userService){
		this.userService = _userService;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String Users(Model model){
		List<User> userList = userService.GetAllUsers();
		
		model.addAttribute("userList",userList);
		
		return "users";
	}
}
