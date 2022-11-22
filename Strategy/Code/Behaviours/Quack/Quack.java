package DesignPatterns.StrategyDesignPattern.Code.Behaviours.Quack;

public class Quack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

}
