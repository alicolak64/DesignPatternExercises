package DesignPatterns.StrategyDesignPattern.Code.Ducks;

import DesignPatterns.StrategyDesignPattern.Code.Behaviours.Fly.FlyWithWings;
import DesignPatterns.StrategyDesignPattern.Code.Behaviours.Quack.Quack;
import DesignPatterns.StrategyDesignPattern.Code.Duck;

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
