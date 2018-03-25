package com.eyeopen.exception;

public class CountryValidationException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public CountryValidationException() {
	}
	public CountryValidationException(String arg0) {
		super(arg0);				
	}
	public CountryValidationException(Throwable arg0) {
		super(arg0);
	}
	public CountryValidationException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}
	public CountryValidationException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

}
