package com.bridgelabz.User.Registration.Test;

import static org.junit.Assert.*;
import com.bridgelabz.User.Registration.Main.*;
import org.junit.Test;

public class UserRegistrationRunner {
	
	@Test
	public void checkFirstNameIsValidOrNot(){
		assertEquals(true, UserRegistration.validateName("Karan"));
	}

}
