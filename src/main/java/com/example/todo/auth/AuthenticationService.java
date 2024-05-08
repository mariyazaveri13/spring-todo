package com.example.todo.auth;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticate(String username,String pwd) {
		
		boolean isValidName = username.equalsIgnoreCase("mariya");
		boolean isValidPwd = pwd.equalsIgnoreCase("mmm");
		
		return isValidName && isValidPwd;
	}
}
