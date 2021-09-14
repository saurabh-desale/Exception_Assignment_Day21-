package com.blz;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class RegexTestWithexceptions {
	RegistrationForm form = new RegistrationForm();
	
	@Test
	public void testNameInvalidWithMinThreeCharacter_Fail() throws InvalidUserDetails{
		try {
		assertFalse(form.firstName("Om"));
		throw new InvalidUserDetails();
		}catch(InvalidUserDetails ex) {
			System.out.println("Invalid User Details for min three character");
		}
	}
	@Test
	public void testNameInValidStartWithCap_Fail() throws InvalidUserDetails{
		try{
			assertFalse(form.firstName("saurabh"));
			throw new InvalidUserDetails();
		}catch(InvalidUserDetails ex) {
			System.out.println("Invalid User Details for first name start with cap  ");
		}
	}
	
	@Test
	public void testPassInvalidWithGap_Fail() {
		
		try {
			assertFalse(form.userPass("Cristaino 07@#"));
			throw new InvalidUserDetails();
		}catch(InvalidUserDetails ex) {
			System.out.println("Invalid User Details: space is not required");
		}
	}
	
	@Test
	public void testPassInvalidWithAtleastEightCharacter_Fail() {
		try {
			assertFalse(form.userPass("Cri07@#"));
			throw new InvalidUserDetails();
		}catch(InvalidUserDetails ex) {
			System.out.println("Invalid User Details for At Least eight character");
		}
	}
	
	@Test
	public void testPassInvalidWithOneUpperCase_Fail() throws InvalidUserDetails{
		
		try {
			assertFalse(form.userPass("ristaino07@#"));
			throw new InvalidUserDetails();
		}catch(InvalidUserDetails ex) {
			System.out.println("Invalid User Details for At Least One Upper Case");
		}
	}
	
	@Test
	public void testPassInvalidWithAtLeastOneNumericNumber_Fail() {
		try {
			assertFalse(form.userPass("Cristaino@#"));
			throw new InvalidUserDetails();
		}catch(InvalidUserDetails ex) {
			System.out.println("Invalid User Details for At Least One Numeric Number");
		}
	}
	
	@Test
	public void testPassInvalidWithAtLeastOneSpecialCharacter_Fail() throws InvalidUserDetails{
		try {
		assertFalse(form.userPass("Cristaino012"));
		throw new InvalidUserDetails();
		}catch(InvalidUserDetails ex) {
			System.out.println("Invalid User Details for At Least One Special Character");
		}
		
	}
	
	@Test
	public void testEmailInValid_Fail() {
		try {
			assertFalse(form.userEmail("abc.@gmail.com"));
			throw new InvalidUserDetails();
		}catch(InvalidUserDetails ex) {
			System.out.println("Invalid User Email");
		}
	}

	@Test
	public void testEmail1InValid_Fail() {
		try {
			assertFalse(form.userEmail("abc@abc@gmail.com"));
			throw new InvalidUserDetails();
		}catch(InvalidUserDetails ex) {
			System.out.println("Invalid User Email");
		}
	}

	@Test
	public void testEmail11InValid_Fail() {
		try {
			assertFalse(form.userEmail("abc@gmail.com.1a"));
			throw new InvalidUserDetails();
		}catch(InvalidUserDetails ex) {
			System.out.println("Invalid User Email");
		}
	}

	@Test
	public void testEmail12InValid_Fail() {
		try {
			assertFalse(form.userEmail("abc@gmail.com.aa.au"));
			throw new InvalidUserDetails();
		}catch(InvalidUserDetails ex) {
			System.out.println("Invalid User Email");
		}
	}
	
	@Test
	public void testNumberInValid_Fail() {
		try {
			assertFalse(form.userNumber("00 0370636399"));
			throw new InvalidUserDetails();
		}catch(InvalidUserDetails ex) {
			System.out.println("Invalid User Phone Number");
		}
	}

}
