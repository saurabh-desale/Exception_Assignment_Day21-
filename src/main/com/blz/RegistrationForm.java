package com.blz;

import java.util.regex.Pattern;

public class RegistrationForm {

	public boolean firstName(String firstName) {
		return IsValidPattern(firstName, Constants.FIRST_NAME);

	}

	public boolean lastName(String lastName) {
		return IsValidPattern(lastName, Constants.LAST_NAME);

	}

	public boolean userPass(String userPass) {
		return IsValidPattern(userPass, Constants.PASSWORD_REGEX);
	}

	public boolean userEmail(String userEmail) {
		return IsValidPattern(userEmail, Constants.MAIL_REGEX);
	}

	public boolean userNumber(String userNumber) {
		return IsValidPattern(userNumber, Constants.NUMBER_REGEX);
	}

	public static boolean IsValidPattern(String input, String regex) {
		return Pattern.compile(regex).matcher(input).matches();
	}

}
