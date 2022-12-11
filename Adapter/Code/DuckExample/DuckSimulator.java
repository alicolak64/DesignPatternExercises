public class DuckSimulator {

    public static void main(String[] args) {


        Duck mallardDuck = new MallardDuck();
        System.out.println("Mallard duck:");
        mallardDuck.display();
        mallardDuck.performSound();
        mallardDuck.performFly();

        Duck modelDuck = new ModelDuck();
        System.out.println("Model duck:");
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.performFly();

        Turkey wildTurkey = new WildTurkey();
        System.out.println("Wild turkey:");
        wildTurkey.display();
        wildTurkey.performSound();
        wildTurkey.performFly();

        Turkey domesticTurkey = new DomesticTurkey();
        System.out.println("Domestic turkey:");
        domesticTurkey.display();
        domesticTurkey.performSound();
        domesticTurkey.performFly();


        System.out.println("Mallard Duck : ");
        simulateDuck(mallardDuck);

        System.out.println("Model Duck : ");
        simulateDuck(modelDuck);

        Duck turkeyAdapter1 = new TurkeyAdapter(domesticTurkey);
        System.out.println("Domestic turkey adapter:");
        simulateDuck(turkeyAdapter1);

        Duck turkeyAdapter2 = new TurkeyAdapter(wildTurkey);
        System.out.println("Wild turkey adapter:");
        simulateDuck(turkeyAdapter2);


        Turkey modelTurkey = new ModelTurkey();
        System.out.println("Model turkey:");
        modelTurkey.display();
        modelTurkey.performSound();
        modelTurkey.performFly();

        Duck turkeyAdapter3 = new TurkeyAdapter(modelTurkey);
        System.out.println("Model turkey adapter:");
        simulateDuck(turkeyAdapter3);


        System.out.println("Changing the sound behaviour of the model turkey:");
        modelTurkey.setSoundBehaviour(new MuteQuack());
        modelTurkey.performSound();
        System.out.println("Changing the fly behaviour of the model turkey adapter:");
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.performFly();

        System.out.println("Changing the behaviour of the model turkey adapter:");
        simulateDuck(turkeyAdapter3);



    }

    public static void simulateDuck(Duck duck) {
        duck.performSound();
        duck.performFly();
    }

}
