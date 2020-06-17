package com.game;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "PAPER");
        map.put(2, "ROCK");
        map.put(3, "SCISSORS");

        int scoreA = 0;
        int scoreB = 0;
        int drawCount = 0;

        for (int i = 1; i <= 100; i++) {
            Random random = new Random();
            String playerA = map.get(1);
            String playerB = map.get(random.nextInt(3) + 1);
            if (playerA.equals(playerB)) {
                drawCount++;
            } else {
                if (playerB.equals(map.get(3))) {
                    scoreB++;
                } else {
                    scoreA++;
                }
            }

        }

        System.out.println("Player A wins " + scoreA + " of 100 games");
        System.out.println("Player B wins " + scoreB + " of 100 games");
        System.out.println("Tie " + drawCount + " of 100 games");
        String messageA = MessageFormat.format("Winner is Player A ({0} to {1} wins)", scoreA, scoreB);
        String messageB = MessageFormat.format("Winner is Player B ({0} to {1} wins)", scoreB, scoreA);
        System.out.println(scoreA > scoreB ? messageA : messageB);

    }
}