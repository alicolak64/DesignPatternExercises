package DesignPatterns.StrategyDesignPattern.Code.Ducks;


import DesignPatterns.StrategyDesignPattern.Code.Behaviours.Fly.FlyNoWay;
import DesignPatterns.StrategyDesignPattern.Code.Behaviours.Quack.Squeak;
import DesignPatterns.StrategyDesignPattern.Code.Duck;

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
