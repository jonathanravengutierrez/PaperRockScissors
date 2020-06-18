package com.game;

public enum Moves {
  ROCK(0),
  PAPER(1),
  SCISSORS(2);

  public final int value;
  Moves(int value) {
    this.value = value;
  }

  public Moves losesTo;
  public boolean losesTo(Moves moves) {
    return losesTo == moves;
  }

  static {
    SCISSORS.losesTo = ROCK;
    ROCK.losesTo = PAPER;
    PAPER.losesTo = SCISSORS;
  }
}
