public class ModelDuck extends Duck {

    public ModelDuck() {
        super.setFlyBehaviour(new FlyNoWay());
        super.setSoundBehaviour(new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }

}
