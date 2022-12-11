public class TurkeyAdapter extends Duck {

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void display() {
        turkey.display();
    }

    @Override
    public void performFly() {
        turkey.performFly();
    }

    @Override
    public void performSound() {
        turkey.performSound();
    }

}
