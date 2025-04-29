package com.chapter04_control_flow.looping;

public class Application {
    public static void main(String[] args) {
        A_for a = new A_for();
//        a.testSimpleForStatement();
//        a.testForExample();
//        a.testForExample2();
//        a.testForExample3();
//        a.printSimpleGugudan();

        A_nestedFor b = new A_nestedFor();
//        b.printGugudanFromTwoToNine();
//        b.printStarInputRowTimes();

        B_while c = new B_while();
//        c.testSimpleWhile();
//        c.testwWhileExample();
//        c.testWhileExample2();

        B_nestedWhile d = new B_nestedWhile();
//        d.testWhileExample3();

        C_doWhile doWhile = new C_doWhile();
//        doWhile.testSimpleDoWhileStatement();
        doWhile.testDoWhileExample();
    }
}
