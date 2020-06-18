package com.game;

import java.text.MessageFormat;

class Result {

  static void printResult(int aScore, int bScore, int gameCount) {
    int drawScore = getDraw(aScore, bScore, gameCount);
    String messageA = MessageFormat.format("Winner is Player A ({0} to {1} wins)", aScore, bScore);
    String messageB = MessageFormat.format("Winner is Player B ({0} to {1} wins)", bScore, aScore);

    System.out.println(MessageFormat.format("Player A wins {0} of {1} games", aScore, gameCount));
    System.out.println(MessageFormat.format("Player B wins {0} of {1} games", bScore, gameCount));
    System.out.println(MessageFormat.format("Tie {0} of {1} games", drawScore, gameCount));
    System.out.println(aScore > bScore ? messageA : messageB);

  }

  private static int getDraw(int aScore, int bScore, int gameCount) {
    return gameCount - (aScore + bScore);
  }

}
