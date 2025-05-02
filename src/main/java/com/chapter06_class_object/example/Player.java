package com.chapter06_class_object.example;

public class Player {
    private String name;
    private int hp;
    private int attackPower;
    private int defensePower;

    public Player(String name, int hp, int attackPower, int defensePower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
    }

    public void attackMonster (Monster monster) {
        System.out.println(this.name + "(이)가 몬스터를 공격했습니다.");
        monster.isDemaged(attackPower);
    }

    public void defense(int monsterAttack) {
        System.out.println(this.name + "(이)가 " + monsterAttack + "만큼의 공격을 받았습니다.");
        System.out.println(this.name + "(이)가 " + this.defensePower + "만큼 방어했습니다.");
        int defense = monsterAttack - defensePower;
        this.hp -= defense;
        if (this.hp <= 0 ) {
            System.out.println(this.name + "은 죽었습니다.");
        }
        System.out.println("현재 " + this.name + "의 체력 : " + this.hp);
    }

    public int hp() {
        return this.hp;
    }
}
