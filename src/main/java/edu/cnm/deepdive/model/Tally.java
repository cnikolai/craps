package edu.cnm.deepdive.model;

public class Tally {

  private int wins;
  private int losses;

  public void lose() {
    losses++;
  }

  public void win() {
    wins++;
  }

  public int getPlays() {//how many rounds occured
    return wins + losses;
  }

  public double getPercentage() {
    int plays = getPlays();
    return (plays > 0) ? (double) wins / plays : 0;
  }

  public int getWins() {
    return wins;
  }

  public int getLosses() {
    return losses;
  }
}
