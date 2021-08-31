package com.bridgelabz.User.Registration.Test;

import java.util.*;
import static org.junit.Assert.*;
import com.bridgelabz.User.Registration.Main.*;
import org.junit.Test;

public class UserRegistrationRunner {

	@Test
	public void checkEmailIdIsValidOrNot() {
		assertEquals(true, UserRegistration.validateEmail("abc@yahoo.com"));
		assertEquals(true, UserRegistration.validateEmail("abc-100@abc.net"));
		assertEquals(true, UserRegistration.validateEmail("abc111@abc.com"));
		assertEquals(true, UserRegistration.validateEmail("abc-100@abc.net.au"));
		assertEquals(true, UserRegistration.validateEmail("abc.100@abc.co.in"));
		assertEquals(true, UserRegistration.validateEmail("abc.xyz@bridgelabz.co.in"));

	}

}