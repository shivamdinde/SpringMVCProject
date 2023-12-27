package day10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import day10.model.User;
import day10.model.UserValidator;

@Controller
public class SpringMvcController {
	@RequestMapping("/login")
	public String getLoginPage() {
		return "login";//Returns view name
	}
	
	@RequestMapping(value = "/doValidate", method = RequestMethod.POST)
	public String getResultPage(@RequestParam("uid") String userName, @RequestParam("pwd") String password) {
		String resultPage = "failure";
		User userModel = new User(userName, password); //Building the Data Model
		boolean success = UserValidator.isValid(userModel);
		if(success)
			resultPage = "success";
		return resultPage;
	}
}
