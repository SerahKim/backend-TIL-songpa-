package com.chapter06_class_object.example;

public class Monster {
    private int hp;
    private int attackPower;

    public Monster() {
        this.hp = 8000;
        this.attackPower = 500;
    }


    public void attackPlayer(Player player) {
        System.out.println("몬스터가 플레이어를 공격합니다!");
        player.defense(attackPower);
    }

    public void isDemaged (int demage) {
        this.hp -= demage;
        if(this.hp <= 0) {
            System.out.println("몬스터는 죽었습니다.");
        }
        System.out.println("몬스터가 " + demage + "만큼의 공격을 입었습니다.");
        System.out.println("현재 몬스터의 hp : " + this.hp);
    }

    public int hp() {
        return this.hp;
    }
}
