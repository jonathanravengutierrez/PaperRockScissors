package com.game;

public class PlayerA implements PlayAction {

  private Moves move;

  @Override
  public void play() {
    this.move = Moves.PAPER;
  }

  public Moves getMove() {
    return move;
  }

}
