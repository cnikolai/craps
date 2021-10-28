package edu.cnm.deepdive.model;

import java.util.Arrays;
import java.util.Random;

public class Roll {

  private final int die1;
  private final int die2;

  public Roll(Random rng) {
    this(rng.nextInt(6) + 1,rng.nextInt(6) + 1); //this calls constructor
  }

  public Roll(int die1, int die2) {
    this.die1 = die1;
    this.die2 = die2;
  }

  public int getValue() {
    return die1 + die2;
  }

  public int getDie1() {
    return die1;
  }

  public int getDie2() {
    return die2;
  }

  public int[] getDice() {
    return new int[]{die1,die2};
  }

  @Override
  public String toString() {
    return Arrays.toString(getDice());
  }
}
