package edu.cnm.deepdive.model;

import java.util.Random;

public class Game {

  private final Tally tally;
  private final Random rng;

  public Game(Random random) {
    this.rng = random;
    tally = new Tally();
  }

  public Round play(int rounds) {
    Round round = null;
    for (int i = 0; i < rounds; i++) {
      round = new Round();
      round.play(rng);
      if (round.isWin()) { // a round only ends if it hits a terminal state (i.e. Win or Loss)
        tally.win();
      }  else {
        tally.lose();
      }
    }
    return round;
  }

  public int getPlays() {
    return tally.getPlays();
  }

  public double getPercentage() {
    return tally.getPercentage();
  }

  public int getWins() {
    return tally.getWins();
  }

  public int getLosses() {
    return tally.getLosses();
  }
}
