package com.chapter13_exception.userexception;

import com.chapter13_exception.userexception.exception.MoneyNegativeException;
import com.chapter13_exception.userexception.exception.NotEnoughMoneyException;
import com.chapter13_exception.userexception.exception.PriceNegativeException;

public class Application1 {
    public static void main(String[] args) {
        /* 사용자 정의 예외 클래스 */
        ExceptionTest et = new ExceptionTest();

//        try {
//            et.checkEnoughMoney(50000, 30000);
//        } catch (PriceNegativeException e) {
//            throw new RuntimeException(e);
//        } catch (MoneyNegativeException e) {
//            throw new RuntimeException(e);
//        } catch (NotEnoughMoneyException e) {
//            throw new RuntimeException(e);
//        }

        /* 제일 부모 클래스인 exception으로만으로도 처리할 수 있다.*/
        try {
//            et.checkEnoughMoney(5000, 3000);
            et.checkEnoughMoney(-5000, 3000);
        } catch (Exception e) {
            e.printStackTrace(); // 에러를 찍어볼 수 있는 메소드
        }
    }
}
