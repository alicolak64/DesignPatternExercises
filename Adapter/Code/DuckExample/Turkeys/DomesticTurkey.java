public class DomesticTurkey extends Turkey {

    public DomesticTurkey() {
        super.setFlyBehaviour(new FlyShortDistance());
        super.setSoundBehaviour(new Gobble());
    }

    @Override
    public void display() {
        System.out.println("I'm a domestic turkey");
    }

}
