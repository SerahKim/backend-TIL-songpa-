package com.chapter06_class_object.example;

public class Monster {
    private Character character;

    public Monster() {
        this.character = new Character("슬라임", 500, 200);
    }

    // 플레이어 공격
    public void attackPlayer1(Player player) {
        if (player != null) {
            System.out.println("몬스터가 플레이어를 " + this.character.getAttackPower() + "만큼 공격했습니다.");
            player.takeDamage(this.character.getAttackPower());
        }
    }

    public void attackPlayer2(Player player) {
        if (player != null) {
            System.out.println("몬스터가 플레이어를 " + this.character.getAttackPower() + "만큼 공격했습니다.");
            player.defenseDamage(this.character.getAttackPower());
        }
    }

    // 플레이어로부터 받는 데미지
    public void takeDamage(int damage) {
        this.character.takeDamage(damage);
        System.out.println(this.character.getName() + "이 " + damage + "만큼의 피해를 입었습니다.");
    }

    // 현재 hp 상태
    public int getMonsterHp() {
        this.character.checkHp();
        return this.character.getHp();
    }
}
