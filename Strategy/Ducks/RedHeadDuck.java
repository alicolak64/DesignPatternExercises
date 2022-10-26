package Ducks;

import Behaviours.Fly.FlyWithWings;
import Behaviours.Quack.Quack;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        super.setFlyBehaviour(new FlyWithWings());
        super.setQuackBehaviour(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a real Red Headed duck");
    }

}
