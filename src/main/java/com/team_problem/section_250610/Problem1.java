package com.team_problem.section_250610;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {
    public static void main(String[] args) {


    }
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            indexMap.put(players[i], i);
        }

        for (String player : callings) {
            int currentIndex = indexMap.get(player);
            int prevIndex = indexMap.get(player) - 1;

            String temp = players[prevIndex];
            players[prevIndex] = players[currentIndex];
            players[currentIndex] = temp;

            indexMap.put(player, prevIndex);
            indexMap.put(temp, currentIndex);
        }

        return players;
    }
}
