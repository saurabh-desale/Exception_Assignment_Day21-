package com.blz;

public class Constants {
	public static final String FIRST_NAME = "^[A-Z][a-z]{3,}";
	public static final String LAST_NAME = "^[A-Z][a-z]{3,}";
	public static final String MAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.){1,2}[a-zA-Z]{2,7}$";
	public static final String NUMBER_REGEX = "^[0-9]{2}[ ][6789]{1}+[0-9]{9}$";
	public static final String PASSWORD_REGEX = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-])(?=\\S+$).{8,}$";

}
