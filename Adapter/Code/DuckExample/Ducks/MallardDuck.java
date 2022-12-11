public class MallardDuck extends Duck {

    public MallardDuck() {
        super.setFlyBehaviour(new FlyWithWings());
        super.setSoundBehaviour(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }

}
