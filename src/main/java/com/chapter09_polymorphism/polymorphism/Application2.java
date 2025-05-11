package com.chapter09_polymorphism.polymorphism;

public class Application2 {
    public static void main(String[] args) {
        /* 다형성 객체 배열 */
        Animal[] animals = new Animal[5];
        animals[0] = new Rabbit();
        animals[1] = new Tiger();
        animals[2] = new Rabbit();
        animals[3] = new Tiger();
        animals[4] = new Rabbit();

        /* Animal 클래스가 가지는 메소드를 오버라이딩한 메소드 호출 시 동적 바인딩을 이용할 수 있다. */
        for (int i = 0; i < animals.length; i++) {
            animals[i].cry();
        }

        for (int i = 0; i < animals.length; i++){
            if(animals[i] instanceof  Rabbit) {
                ((Rabbit) animals[i]).jump(); // 고유 메소드를 동작시키기 위해선 다운 캐스팅을 해야한다.
            } else if (animals[i] instanceof Tiger) {
                ((Tiger) animals[i]). bite();
            } else {
                System.out.println("호랑이나 토끼가 아닙니다.");
            }
        }
    }
}
