package com.game;

import java.util.Random;

public class PlayerB implements PlayAction {

  private Moves move;

  @Override
  public void play() {
    Random random = new Random();
    this.move = Moves.values()[random.nextInt(3)];
  }

  public Moves getMove() {
    return move;
  }

}
