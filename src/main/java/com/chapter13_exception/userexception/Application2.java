package com.chapter13_exception.userexception;

import com.chapter13_exception.userexception.exception.MoneyNegativeException;
import com.chapter13_exception.userexception.exception.NotEnoughMoneyException;
import com.chapter13_exception.userexception.exception.PriceNegativeException;

public class Application2 {
    public static void main(String[] args) {
        /* multi block */
        ExceptionTest et = new ExceptionTest();

        /*
        위에서부터 아래로 실행되며 해당 되는 catch 구문이 있을 경우
        아래에 있는 catch구문에는 도달 할 수 없음.
        따라서, 상위 타입의 exception은 가장 아래쪽에 작성해주어야 한다.
        */
        try {
            et.checkEnoughMoney(2000, -3000);
        } catch (PriceNegativeException e) {
            System.out.println("PriceNagativeException 발생!");
            System.out.println(e.getMessage());
        } catch (MoneyNegativeException e) {
            System.out.println("MoneyNagativeException 발생!");
            System.out.println(e.getMessage());
        } catch (NotEnoughMoneyException e) {
            System.out.println("NotEnoughMoenyException 발생");
            System.out.println(e.getMessage());
        } finally {
            /* 예외 발생 여부와 상관 없이 실행할 내용 */
            System.out.println("finally 블럭의 내용이 동작함");
        }
    }
}
