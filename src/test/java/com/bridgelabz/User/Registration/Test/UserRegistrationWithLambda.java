package com.bridgelabz.User.Registration.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface userValidation{
	boolean validate(String userData);
}

public class UserRegistrationWithLambda {
	
	
	public static void main(String[] args) {
		userValidation firstName = (input) -> {
			String firstnameRegex = "^[A-Z]{1}[a-z]{3,}$";
			Pattern p = Pattern.compile(firstnameRegex);
			Matcher m = p.matcher(input);
			if(m.matches() == true) {
				return true;
			}
			else {
				return false;
			}
		};
		
		userValidation lastName = (input) -> {
			String lastnameRegex = "^[A-Z]{1}[a-z]{3,}$";
			Pattern p = Pattern.compile(lastnameRegex);
			Matcher m = p.matcher(input);
			if(m.matches() == true) {
				return true;
			}
			else {
				return false;
			}
		};
		
		userValidation mobileNumber = (input) -> {
			String mobileNumberRegex = "^(91)( )([7-9]{1})([0-9]{9})$";
			Pattern p = Pattern.compile(mobileNumberRegex);
			Matcher m = p.matcher(input);
			if(m.matches() == true) {
				return true;
			}
			else {
				return false;
			}
		};
		
		userValidation EmailId = (input) -> {
			String EmailIdRegex = "^(([a-zA-Z0-9]{3,8}\\.*\\-*[a-z0-9]{0,8})+@([a-z0-9]{1,8})+(\\.[a-z]{2,8}\\.*[a-z]{0,4}))$";
			Pattern p = Pattern.compile(EmailIdRegex);
			Matcher m = p.matcher(input);
			if(m.matches() == true) {
				return true;
			}
			else {
				return false;
			}
		};
		
		userValidation password = (input) -> {
			String passwordRegex = "^([A-Z]{1,12})([a-z]{1,12})([0-9]{1,12})([!@#$%^&*]{1})$";
			Pattern p = Pattern.compile(passwordRegex);
			Matcher m = p.matcher(input);
			if(m.matches() == true) {
				return true;
			}
			else {
				return false;
			}
		};
		
		//Happy Test Cases
		System.out.println("Karan Validation for first name is " + firstName.validate("Karan"));
		System.out.println("Mehta Validation for last name is" + lastName.validate("Mehta"));
		System.out.println("Mobile no. Validation is " + mobileNumber.validate("91 9630852741"));
		System.out.println("Email-Id Validation is " + EmailId.validate("karan.mehta@gmail.com"));
		System.out.println("Password Validation is " + password.validate("Karan89@"));
		
		//Sad Test Cases
		System.out.println("-------------------------------------------");
		System.out.println("Karan Validation for first name is " + firstName.validate("karan"));
		System.out.println("Mehta Validation for last name is " + lastName.validate("Me"));
		System.out.println("Mobile no. Validation is  " + mobileNumber.validate("9630852741"));
		System.out.println("Email-Id Validation is " + EmailId.validate("karangmail.com"));
		System.out.println("Password Validation is" + password.validate("karan89@"));
	}
	
}
