public class WildTurkey extends Turkey {


    public WildTurkey() {
        super.setFlyBehaviour(new FlyShortDistance());
        super.setSoundBehaviour(new Gobble());
    }

    @Override
    public void display() {
        System.out.println("I'm a wild turkey");
    }

}
