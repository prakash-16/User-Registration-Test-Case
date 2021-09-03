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

}
