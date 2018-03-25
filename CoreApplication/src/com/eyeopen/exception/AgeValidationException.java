package com.eyeopen.exception;

public class AgeValidationException extends Exception {
	private static final long serialVersionUID = 1L;
	public AgeValidationException() {
	}
	public AgeValidationException(String arg0) {
		super(arg0);
	}
	public AgeValidationException(Throwable arg0) {
		super(arg0);
	}
	public AgeValidationException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}
	public AgeValidationException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}
}
