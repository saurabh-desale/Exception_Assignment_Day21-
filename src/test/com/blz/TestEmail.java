package com.blz;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestEmail {

	String userInput;
	boolean expectedResult;

	public  TestEmail(String input, boolean expected) {
		expectedResult = expected;
		userInput = input;
	}

	@Parameters
	public static Collection initInputs() {

		return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com", true },
				{ "abc-100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", true },
				{ "abc.100@abc.com.au", true }, { "abc@1.com", true }, { "abc@gmail.com.com", true },
				{ "abc+100@gmail.com", true }, { "abc", false }, { "abc@.com.my", false }, { "abc123@gmail.a", false },
				{ "abc123@.com", false }, { "abc123@.com.com", false }, { ".abc@abc.com", false },
				{ "abc()*@gmail.com", false }, { "abc@%*.com", false } });
	}

	@Test
	public void testEmail() {
		RegistrationForm myObj = new RegistrationForm();
		boolean actual = myObj.userEmail(userInput);
		assertEquals(expectedResult, actual);
	}
}
