package com.bridgelabz.User.Registration.Test;

import static org.junit.Assert.*;
import com.bridgelabz.User.Registration.Main.*;
import org.junit.Test;

public class UserRegistrationRunner {
	
	@Test
	public void checkFirstNameIsValidOrNot(){
		assertEquals(true, UserRegistration.validateName("Karan"));
	}
	
	public void checkLastNameIsValidOrNot(){
		assertEquals(true, UserRegistration.validateName("Mehta"));
		assertEquals(true, UserRegistration.validateName("Sharma"));
	}
	
	public void checkEmailIdIsValidOrNot() {
		assertEquals(true, UserRegistration.validateEmail("abc@yahoo.com"));
		assertEquals(true, UserRegistration.validateEmail("abc.xyz@bl.co.in"));
	}
	
	
}