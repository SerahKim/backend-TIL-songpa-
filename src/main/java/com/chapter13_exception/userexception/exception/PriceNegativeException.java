package com.chapter13_exception.userexception.exception;

public class PriceNegativeException extends NegativeException{

    public PriceNegativeException(String message) {
        super(message);
    }
}
