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

    // name setter
    public void setName(String name) {
        this.name = name;
    }

    // hp setter
    public void setHp(int hp) {
        this.hp = hp;
    }

    // name getter
    public String getName() {
        return name;
    }

    // hp getter
    public int getHp() {
        return hp;
    }

    // attackPower getter
    public int getAttackPower() {
        return attackPower;
    }

    // 피해 측정 메소드
    public void takeDamage(int damage) {
        this.hp = hp - damage;
    }

    // HP 회복 메서드
    public void heal(int amount) {
        if (amount > 0) {
            this.hp += amount;
        }
        System.out.println(this.name + "이 " + amount + "만큼의 hp를 회복하였습니다.");
    }

    // 생사 여부 메소드
    public void checkHp() {
        System.out.println("현재 " + this.name + "의 hp는 " + this.hp + "입니다.");
    }

}
