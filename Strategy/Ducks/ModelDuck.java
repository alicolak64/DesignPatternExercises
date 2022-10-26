package Ducks;

import Behaviours.Fly.FlyNoWay;
import Behaviours.Quack.MuteQuack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        super.setFlyBehaviour(new FlyNoWay());
        super.setQuackBehaviour(new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }

}
