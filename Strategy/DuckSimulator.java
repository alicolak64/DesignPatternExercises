import Behaviours.Fly.FlyRocketPowered;
import Ducks.Duck;
import Ducks.MallardDuck;
import Ducks.ModelDuck;

public class DuckSimulator {

    public static void main(String[] args) {


        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        

    }

}
