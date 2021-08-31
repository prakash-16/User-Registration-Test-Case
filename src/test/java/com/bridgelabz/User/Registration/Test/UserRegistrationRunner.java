package com.bridgelabz.User.Registration.Test;

import java.util.*;
import static org.junit.Assert.*;
import com.bridgelabz.User.Registration.Main.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class UserRegistrationRunner {

	private String email;

	public UserRegistrationRunner(String email) {
		this.email = email;
	}

	@Parameterized.Parameters
	public static Collection UserRegistration() {
		Object[][] input = { { "abc.xyz@bl.co.in" }, { "abc@gmail.com" }, { "abc111@abc.com" },
				{ "abc.100@abc.co.in" } };

		return Arrays.asList(input);
	}

	@Test
	public void testEmailId() {
		assertEquals(true, UserRegistration.validateEmail(email));
	}
}