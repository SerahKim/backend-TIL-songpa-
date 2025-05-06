package com.chapter06_class_object.example;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        /*
        프로그램 개요
        플레이어가 몬스터를 무찌르는 프로그램

        시스템 요구사항
        - 플레이어
        1. 플레이어는 이름, 체력(HP), 공격력, 방어력을 가진다.
            - 이름은 사용자로부터 입력 받고, 체력, 공격력, 방어력은 정해져 있는 값이다.
        2. 플레이어는 "공격하기", "방어하기", "회복하기"를 할 수 있다.
        3. 플레이어가 '공격하기'를 선택하면,
            - 몬스터의 공격을 그대로 받는다.
            - 몬스터에게 공격력만큼 피해를 준다.
        4-1. 플레이어가 '방어하기'를 선택하면,
            - 방어력을 적용해 피해를 줄일 수 있다.
            - 단, 몬스터의 체력은 줄어들지 않는다.
        4-2. 플레이어가 '회복하기'를 선택했다면,
            - 플레이어의 HP가 20 증가함.
            - 단, 방어효과는 없으며, 플레이어의 최대 HP 이상으로는 회복할 수 없다.)
        5. 플레이어의 방어력은 몬스터의 공격력보다 높게 설정될 수 없다.

        - 몬스터
        1. 몬스터는 이름, 체력(HP), 공격력을 가진다.
        2. 몬스터는 매 턴마다 플레이어를 공격한다.
        3. 몬스터의 공격은 방어하지 않으면 그대로 플레이어에게 피해를 입힌다.

        - 전투 시스템
        1. 전투는 플레이어와 몬스터가 한 턴씩 번갈아가며 진행된다.
            - 플레이어 선공.
        2. 플레이어는 매 턴 다음 중 하나를 선택할 수 있다:
            (1) 공격하기
            (2) 방어하기
            (3) 회복하기
        3. 플레이어의 공격 후, 몬스터가 살아 있으면 반격한다.
        4. 플레이어나 몬스터의 체력이 0 이하가 되면 전투는 종료된다.
        5. 승리 시 "플레이어 승리!", 패배 시 "몬스터 승리!" 메시지를 출력한다.
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("플레이어의 이름을 입력해주세요. : ");
        String name = sc.nextLine();

        Player player = new Player(name);
        Monster monster = new Monster();

        System.out.println("================게임 시작================");
        // 게임 처음은 몬스터 공격(플레이어 선공)
        player.attackMonster(monster);
        monster.attackPlayer1(player);

        while (player.getPlayerHp() > 0 || monster.getMonsterHp() > 0) {
            System.out.println("(1) 공격하기 (2) 방어하기 (3) 회복하기");
            int num = sc.nextInt();

            switch (num) {
                case 1 :
                    player.attackMonster(monster);
                    monster.attackPlayer1(player);
                    break;
                case 2 :
                    player.attackMonster(monster);
                    monster.attackPlayer2(player);
                    break;
                case 3 :
                    player.healHP();
                    break;
            }

            if (player.getPlayerHp() <= 0) {
                System.out.println("몬스터의 승리입니다!");
            } else if (monster.getMonsterHp() <= 0) {
                System.out.println(name + "의 승리입니다!");
            }
        }

        System.out.println("게임이 종료되었습니다.");
    }
}
