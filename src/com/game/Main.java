package com.game;

public class Main {

    private static final Integer GAME_COUNT = 100;

    public static void main(String[] args) {
        PlayerA playerA = new PlayerA();
        PlayerB playerB = new PlayerB();
        int playerAScore = 0;
        int playerBScore = 0;

        for (int i = 1; i <= GAME_COUNT ; i++) {
            playerA.play();
            playerB.play();
            if (playerA.getMove().losesTo(playerB.getMove())) {
                playerBScore++;

            } else if (playerB.getMove().losesTo(playerA.getMove())) {
                playerAScore++;

            }
        }
        Result.printResult(playerAScore, playerBScore, GAME_COUNT);

    }

}