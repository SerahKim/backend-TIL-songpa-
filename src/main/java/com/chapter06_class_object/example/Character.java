package com.chapter06_class_object.example;

public class Character {
    private String name;
    private int hp;
    private int attackPower;

    public Character(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = (hp > 0)? hp : 0;
        this.attackPower = attackPower;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void takeDamage(int damage) {
        this.hp = hp - damage;
    }
}
