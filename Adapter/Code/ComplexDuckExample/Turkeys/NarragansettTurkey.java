public class NarragansettTurkey extends Turkey {

    public NarragansettTurkey() {
        super.setFlyBehaviour(new FlyShortDistance());
        super.setSoundBehaviour(new Gobble());
    }

    @Override
    public void display() {
        System.out.println("I'm a Narragansett turkey");
    }

}
