package com.dictionary.exceptions;



public class DuplicateEntryException extends Exception {
    public DuplicateEntryException(String message) {
        super(message);
    }

	public DuplicateEntryException() {
	}
}
