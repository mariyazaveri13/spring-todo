package com.example.todo.auth;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	private AuthenticationService authserv;

	public LoginController(AuthenticationService authserv) {
		super();
		this.authserv = authserv;
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String gotoLoginPage() {
		return "login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String gotoWelcomePage(@RequestParam String name, @RequestParam String pwd, ModelMap model) {
		
		if (authserv.authenticate(name, pwd)) {
			model.addAttribute("name", name);
			return "welcome";
		}
		
		model.addAttribute("errMsg", "Invalid Credentials! Try again");
		return "login";
	}
}
