package Ducks;

import Behaviours.Fly.FlyWithWings;
import Behaviours.Quack.Quack;


public class MallardDuck extends Duck {

    public MallardDuck() {
        super.setFlyBehaviour(new FlyWithWings());
        super.setQuackBehaviour(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }

}
