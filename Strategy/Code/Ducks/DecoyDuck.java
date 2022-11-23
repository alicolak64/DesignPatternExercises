public class DecoyDuck extends Duck {

    public DecoyDuck() {
        super.setFlyBehaviour(new FlyNoWay());
        super.setQuackBehaviour(new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("I'm a decoy duck");
    }

}
