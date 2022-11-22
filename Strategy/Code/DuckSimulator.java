package DesignPatterns.StrategyDesignPattern.Code;

import DesignPatterns.StrategyDesignPattern.Code.Behaviours.Fly.FlyRocketPowered;
import DesignPatterns.StrategyDesignPattern.Code.Ducks.MallardDuck;
import DesignPatterns.StrategyDesignPattern.Code.Ducks.ModelDuck;

public class DuckSimulator {

    public static void main(String[] args) {


        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        

    }

}
