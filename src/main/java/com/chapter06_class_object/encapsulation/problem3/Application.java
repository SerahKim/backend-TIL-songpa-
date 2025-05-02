package com.chapter06_class_object.encapsulation.problem3;


public class Application {
    public static void main(String[] args) {
        /*  필드에 직접 접근하는 경우 발생하는 문제점을 해결하는 방법 */
        /*
        메소드로 간접 접근을 했을 시 클래스의 변수가 변경되어도 그 클래스를 사용하고 있는 곳에서는 에러가 발생되지 않는다.
        하지만 아직 필드에 직접 접근이 가능한 방식이다.
        */
        Monster monster1 = new Monster();
        monster1.setInfo("드라큘라");
        monster1.setHp(100);

        Monster monster2 = new Monster();
        monster2.setInfo("프랑켄슈타인");
        monster2.setHp(200);

        Monster monster3 = new Monster();
        monster3.setInfo("늑대인간");
        monster3.setHp(-300);

        // 아직 필드에 직접 접근이 가능하다.
        Monster monster4 = new Monster();
        monster4.name = "두치";
        monster4.hp = -500;

        System.out.println(monster1.getInfo());
        System.out.println(monster2.getInfo());
        System.out.println(monster3.getInfo());
    }
}
