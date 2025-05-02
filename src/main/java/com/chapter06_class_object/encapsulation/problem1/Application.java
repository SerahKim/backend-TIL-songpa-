package com.chapter06_class_object.encapsulation.problem1;

public class Application {
    public static void main(String[] args) {
        /* 필드에 직접 접근하는 경우 발생할 수 있는 문제점 */
        /* 필드에 직접 접근하면 통제가 불가능하다. */
        Monster monster1 = new Monster();
        monster1.name = "두치";
        monster1.hp = 200;

        System.out.println("monster1.name = " + monster1.name);
        System.out.println("monster1.hp = " + monster1.hp);

        // 필드에 직접 접근하면 원하는 대로 동작하지 않는다.
        Monster monster2 = new Monster();
        monster2.name = "드라큘라";
        monster2.hp = -200; // 직접 접근

        System.out.println("monster2.name = " + monster2.name);
        System.out.println("monster2.hp = " + monster2.hp);

        // 메소드를 통해 간접 접근하면 원하는 대로 동작한다.
        Monster monster3 = new Monster();
        monster3.name = "뿌꾸";
        monster3.setHp(-200); // 간접 접근

        System.out.println("monster3.name = " + monster3.name);
        System.out.println("monster3.hp = " + monster3.hp);
   }
}
