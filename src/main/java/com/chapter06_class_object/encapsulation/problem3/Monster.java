package com.chapter06_class_object.encapsulation.problem3;

public class Monster {

    String name;
    int hp;

    // 메소드를 통한 간접 접근
    public void setInfo(String name) {
        this.name = name;
    }

    // 메소드를 통한 간접 접근
    public void setHp (int hp) {
        if(hp > 0) {
            this.hp = hp;
        } else {
            this.hp = 0;
        }
    }

    public String getInfo() {
        return "몬스터의 이름은 " + this.name + "이고, 체력은 " + this.hp + "입니다.";
     }
}
