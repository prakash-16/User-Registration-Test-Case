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
		String emailRegex = "^(([a-zA-Z0-9]{3,8}\\.*\\-*[a-z0-9]{0,8})+@([a-z0-9]{1,8})+(\\.[a-z]{2,8}\\.*[a-z]{0,4}))$";
		Pattern p = Pattern.compile(emailRegex);
		Matcher m = p.matcher(email);
		return m.matches();
	}

	public static boolean validateMobileNumber(String mobileNumber) {
		String mobileNumberRegex = "^(91)( )([7-9]{1})([0-9]{9})$";
		Pattern p = Pattern.compile(mobileNumberRegex);
		Matcher m = p.matcher(mobileNumber);
		return m.matches();
	}

	public static boolean validatePassword(String password) {
		if (password.length() >= 8) {
			String passwordRegex = "^([A-Z]{1,12})([a-z]{1,12})([0-9]{1,12})([!@#$%^&*]{1})$";
			Pattern p = Pattern.compile(passwordRegex);
			Matcher m = p.matcher(password);
			return m.matches();
		} else {
			return false;
		}
	}

}
