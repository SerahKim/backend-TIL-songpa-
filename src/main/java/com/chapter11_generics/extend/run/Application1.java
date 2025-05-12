package com.chapter11_generics.extend.run;

import com.chapter11_generics.extend.*;

public class Application1 {
    public static void main(String[] args) {
        /* extends 키워드 : 내가 원하는 특정 타입만 사용하도록 제네릭 범위 제한 */


//        RabbitFarm<Animal> farm1 = new RabbitFarm<>(); // Rabbit의 상위 클래스인 Animal로는 객체 생성 불가능
//        RabbitFarm<Mammal> farm2 = new RabbitFarm<>(); // Rabbit의 상위 클래스의 Mammal로는 객체 생성 불가능
//        RabbitFarm<Snake> farm3 = new RabbitFarm<>(); // Rabbit과 완전히 다른 타입이므로 객체 생성 불가능
        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>(); // RabbitFarm은 Rabbit으로 extends되어 있음
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();  // Rabbit의 하위 클래스인 Bunny는 Rabbit으로 extends 되어 있기 때문에 사용 가능
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>(); // DrunkenBunny는 Rabbit의 하위 클래스인 Bunny로 extends 되어 있기 때문에 사용 가능

//        farm4.setAnimal(new Snake()); // 객체 타입이 다르기 때문에 set 불가능
        farm4.setAnimal(new Rabbit()); // Rabbit의 하위클래스인 Bunny와 DrunkenBunny 모두 set 가능(다형성)
        ((Rabbit) farm4.getAnimal()).cry();
        (farm4.getAnimal()).cry();

        farm5.setAnimal(new Bunny()); // Bunny의 하위 클래스인 DrunkenBunny만 set 가능(다형성)
        ((Bunny) farm5.getAnimal()).cry();
        (farm5.getAnimal()).cry();

        farm6.setAnimal(new DrunkenBunny());
        ((DrunkenBunny) farm6.getAnimal()).cry();
        (farm6.getAnimal()).cry();
    }
}
