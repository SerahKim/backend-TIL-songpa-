package com.chapter13_exception.userexception.exception;

// 사용자 정의의 Exception 클래스
public class NotEnoughMoneyException extends Exception{
    public NotEnoughMoneyException() {}

    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
