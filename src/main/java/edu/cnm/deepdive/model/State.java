package edu.cnm.deepdive.model;

public enum State {

  COME_OUT {
    @Override
    public State next(Roll roll) {
      State next;
      int value = roll.getValue();
      if (value == 7 || value == 11) {
        next = State.WIN;
      } else if (value == 2 || value == 3 || value == 12) {
        next = State.LOSS;
      } else {
        next = State.POINT;
      }
      return next;
    }

    @Override
    public boolean isTerminal() {
      return false;
    }
  },
  WIN,
  LOSS,
  POINT {
    @Override
    public State next(Roll roll, int point) {
      State next = this; //State.POINT
      int value = roll.getValue();
      if (value == point) {
        next = State.WIN;
      } else if (value == 7) {
        next = State.LOSS;
      }
      return next;
    }

    @Override
    public State next(Roll roll) {
      throw new IllegalStateException(
          "This method can't be invoked when in the POINT state."); //not a checked exception: a runtime exception; therefore, don't have to handle it.
    }

    @Override
    public boolean isTerminal() {
      return false;
    }
  };

  public State next(Roll roll) {
    return this;
  }

  public State next(Roll roll, int point) {
    return next(roll);
  }

  public static State initial() {
    return State.COME_OUT;
  }

  public boolean isTerminal() {
    return true;
  }

}


