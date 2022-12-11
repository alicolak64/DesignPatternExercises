public class DuckAdapter extends Turkey{
    private Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void display() {
        duck.display();
    }

    @Override
    public void performSound() {
        duck.performSound();
    }

    @Override
    public void performFly() {
        duck.performFly();
    }

}
