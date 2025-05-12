package com.chapter11_generics.extend;

public class WildCardFarm {
    /* 매개변수로 전달받는 토끼 농장을 구현할 때 사용한 타입변수 제한 */
    public void anyType(RabbitFarm<?> farm) {
        farm.getAnimal().cry();
    }

    /* Bunny이거나 그 후손 타입으로 만들어진 토끼 농장만 매개변수로 사용 가능*/
    public void extendsType(RabbitFarm<? extends Bunny> farm) {
        farm.getAnimal().cry();
    }

    /* Bunny이거나 그 부모 타입으로 만들어진 토끼농장만 매개변수로 사용 가능*/
    public void superType(RabbitFarm<? super Bunny> farm) {
        farm.getAnimal().cry();
    }
}
