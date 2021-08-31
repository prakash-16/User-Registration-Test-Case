package com.bridgelabz.User.Registration.Test;

import java.util.*;
import static org.junit.Assert.*;
import com.bridgelabz.User.Registration.Main.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class UserRegistrationRunner {

	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String email;
	private String password;
	private boolean value;

	public UserRegistrationRunner(String firstName, String lastName, String mobileNumber, String email,
			String password, boolean value) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.password = password;
		this.value = value;
	}

	@Parameterized.Parameters
	public static Collection UserRegistration() {
		Object[][] input = { { "Karan", "Mehta", "91 9876543210", "abc.xyz@bl.co.in", "Qwerty16@", true},
				{ "Navin", "Sharma", "91 8876543210", "abc@gmail.com", "Qwerty18*", true} };
		
		return Arrays.asList(input);
	}
	
	@Test
	public void testUserData() {
		assertEquals(value,UserRegistration.validateName(firstName));
		assertEquals(value,UserRegistration.validateName(lastName));
		assertEquals(value,UserRegistration.validateMobileNumber(mobileNumber));
		assertEquals(value,UserRegistration.validateEmail(email));
		assertEquals(value,UserRegistration.validatePassword(password));
	}

}