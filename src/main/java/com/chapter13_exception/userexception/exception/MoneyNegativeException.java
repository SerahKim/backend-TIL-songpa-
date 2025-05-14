package com.chapter13_exception.userexception.exception;

public class MoneyNegativeException extends NegativeException {

    public MoneyNegativeException (String message) {
        super(message);
    }
}
