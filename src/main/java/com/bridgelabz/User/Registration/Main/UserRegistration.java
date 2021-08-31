package com.bridgelabz.User.Registration.Main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static boolean validateName(String name) {
		String nameRegex = "^[A-Z]{1}[a-z]{3,}$";
		Pattern p = Pattern.compile(nameRegex);
		Matcher m = p.matcher(name);
		return m.matches();
	}

	public static boolean validateEmail(String email) {
		String emailRegex = "^(([a-zA-Z]{3,8}\\.*[a-z]{0,8})+@([a-z]{2,8})+(\\.[a-z]{2,8}\\.*[a-z]{0,4}))$";
		Pattern p = Pattern.compile(emailRegex);
		Matcher m = p.matcher(email);
		return m.matches();
	}

}
