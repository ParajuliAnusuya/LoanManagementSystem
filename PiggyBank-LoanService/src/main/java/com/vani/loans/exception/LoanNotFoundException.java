package com.vani.loans.exception;

public class LoanNotFoundException extends RuntimeException {
	public LoanNotFoundException(String message) {
        super(message);
    }


}