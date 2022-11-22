package DesignPatterns.StrategyDesignPattern.Code.Behaviours.Quack;

public class MuteQuack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }

}
