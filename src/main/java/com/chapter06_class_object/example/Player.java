package com.chapter06_class_object.example;

public class Player {
    private Character character;
    private int defensePower;

    public Player(String name) {
        this.character = new Character(name, 800, 100);
        this.defensePower =80;
    }

    // (1) 공격하기 : 몬스터 공격
    public void attackMonster(Monster monster) {
        if (monster != null) {
            System.out.println(this.character.getName() + "이 " + this.character.getAttackPower() + "만큼 몬스터를 공격했습니다.");
        monster.takeDamage(this.character.getAttackPower());
        }
    }

    public void takeDamage(int damage) {
        this.character.takeDamage(damage);
        System.out.println(this.character.getName() + "이 " + damage + "만큼의 피해를 입었습니다.");
    }

    // (2) 방어하기 : 방어력만큼 몬스터 데미지 방어
    public void defenseDamage(int damage) {
        int defenseDamage = damage - this.defensePower;
        this.character.takeDamage(defenseDamage);
        System.out.println(this.character.getName() + "이 " + defenseDamage + "만큼의 피해를 입었습니다.");
    }

    // (3) 회복하기 : 플레이어의 HP 20 증가
    public void healHP() {
        this.character.heal(20);
    }


    // 현재 hp 상태
    public int getPlayerHp() {
        this.character.checkHp();
        return this.character.getHp();
    }







}
