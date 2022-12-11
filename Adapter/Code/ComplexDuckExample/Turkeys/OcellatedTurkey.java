public class OcellatedTurkey extends Turkey {

    public OcellatedTurkey() {
        super.setFlyBehaviour(new FlyShortDistance());
        super.setSoundBehaviour(new Gobble());
    }

    @Override
    public void display() {
        System.out.println("I'm an ocellated turkey");
    }


}
