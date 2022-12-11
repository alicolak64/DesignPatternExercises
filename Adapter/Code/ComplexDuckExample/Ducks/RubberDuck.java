public class RubberDuck extends Duck {

    public RubberDuck() {
        super.setFlyBehaviour(new FlyNoWay());
        super.setSoundBehaviour(new Squeak());
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duck");
    }

}
