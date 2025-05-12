package com.chapter11_generics.extend;

// Rabbit 객체 타입만 들어올 수 있음
public class RabbitFarm<T extends Rabbit> {
    private T animal;

    public RabbitFarm() {}

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }
}
