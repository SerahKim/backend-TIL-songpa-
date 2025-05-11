package com.chapter09_polymorphism.polymorphism;

import com.team_problem.section_250508.Application;

public class Application4 {


    public static void main(String[] args) {
        /* 다형성을 적용한 리턴타입 */
        Application4 app4 = new Application4();
        Animal randomAnimal = app4.getRandomAnimal();
        randomAnimal.cry();

    }

    public Animal getRandomAnimal() {
        int random = (int) (Math.random() * 2);

        return random == 0? new Rabbit() : new Tiger();
    }
}
