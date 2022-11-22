package DesignPatterns.StrategyDesignPattern.Code.Ducks;

import DesignPatterns.StrategyDesignPattern.Code.Behaviours.Fly.FlyNoWay;
import DesignPatterns.StrategyDesignPattern.Code.Behaviours.Quack.MuteQuack;
import DesignPatterns.StrategyDesignPattern.Code.Duck;

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
