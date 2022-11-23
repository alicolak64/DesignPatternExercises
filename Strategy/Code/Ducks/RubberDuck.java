public class RubberDuck extends Duck {

    public RubberDuck() {
        super.setFlyBehaviour(new FlyNoWay());
        super.setQuackBehaviour(new Squeak());
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duck");
    }

}
