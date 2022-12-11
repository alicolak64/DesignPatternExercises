public class DuckTestDriver {
    public static void main(String[] args) {

        
        System.out.println("MallardDuck:");
        Duck mallardDuck = new MallardDuck();
        mallardDuck.quack();
        mallardDuck.fly();

        System.out.println("RubberDuck:");
        Duck rubberDuck = new RubberDuck();
        rubberDuck.quack();
        rubberDuck.fly();

        System.out.println("WildTurkey:");
        Turkey wildTurkey = new WildTurkey();
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("DomesticTurkey:");
        Turkey domesticTurkey = new DomesticTurkey();
        domesticTurkey.gobble();
        domesticTurkey.fly();

        System.out.println("TurkeyAdapter with Wild Turkey:");
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
        testDuck(turkeyAdapter);

        System.out.println("TurkeyAdapter with Domestic Turkey:");
        turkeyAdapter = new TurkeyAdapter(domesticTurkey);
        testDuck(turkeyAdapter);

        System.out.println("DuckAdapter with Mallard Duck:");
        Turkey duckAdapter = new DuckAdapter(mallardDuck);
        testTurkey(duckAdapter);

        System.out.println("DuckAdapter with Rubber Duck:");
        duckAdapter = new DuckAdapter(rubberDuck);
        testTurkey(duckAdapter);

    }

    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

    public static void testTurkey(Turkey turkey) {
        turkey.gobble();
        turkey.fly();
    }

}
