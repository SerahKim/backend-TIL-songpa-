package com.chapter11_generics.extend.run;

import com.chapter11_generics.extend.*;

public class Application2 {
    public static void main(String[] args) {
        /*
        와일드카드
        제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을 때, 그 객체의 타입 변수를 제한할 수 있다.
        <?> : 제한 없음
        <? extends Type> : 와일드카드의 상한 제한
        <? super Type> : 와일드카드의 하한 제한
        */
        WildCardFarm wildCardFarm = new WildCardFarm();
//        wildCardFarm.anyType(new RabbitFarm<Mammal> (new Mammal())); // 아예 생성 불가

        /* RabbitFarm에 들어갈 수 있는 타입은 모두 가능*/
        wildCardFarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

//        wildCardFarm.extendsType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.extendsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
//        wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
    }
}
