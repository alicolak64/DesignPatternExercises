public class GumballMachine {

    final State SOLD_OUT;
    final State NO_QUARTER;
    final State HAS_QUARTER;
    final State SOLD;
    final State WINNER;
    State state;
    int count;

    public GumballMachine(int numberGumballs) {
        SOLD_OUT = new SoldOutState(this);
        NO_QUARTER = new NoQuarterState(this);
        HAS_QUARTER = new HasQuarterState(this);
        SOLD = new SoldState(this);
        WINNER = new WinnerState(this);

        this.count = numberGumballs;

        if (numberGumballs > 0) {
            state = NO_QUARTER;
        } else {
            state = SOLD;
        }

    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }

    public int getCount() {
        return count;
    }

    public void refill(int count) {
        this.count += count;
        System.out.println("The gumball machine was just refilled; it's new count is: " + this.count);
        state.refill();
    }

    public void setState(State state) {
        this.state = state;
    }
    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return SOLD_OUT;
    }

    public State getNoQuarterState() {
        return NO_QUARTER;
    }

    public State getHasQuarterState() {
        return HAS_QUARTER;
    }

    public State getSoldState() {
        return SOLD;
    }

    public State getWinnerState() {
        return WINNER;
    }


    public String toString() {

        StringBuilder result = new StringBuilder();

        result.append("""
                Mighty Gumball, Inc.
                Java - enabled Standing Gumball Model #2004
                Inventory:\s""").append(count).append(" gumball");

        if (count != 1) {
            result.append("s");
        }

        result.append("\nMachine is ");

        if (state == SOLD_OUT) {
            result.append("sold out");
        } else if (state == NO_QUARTER) {
            result.append("waiting for quarter");
        } else if (state == HAS_QUARTER) {
            result.append("waiting for turn of crank");
        } else if (state == SOLD) {
            result.append("delivering a gumball");
        }

        result.append("\n\n");

        return result.toString();

    }


}
