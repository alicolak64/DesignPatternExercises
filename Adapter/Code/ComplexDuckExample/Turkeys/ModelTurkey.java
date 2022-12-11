public class ModelTurkey extends Turkey {

    public ModelTurkey() {
        super.setFlyBehaviour(new FlyShortDistance());
        super.setSoundBehaviour(new Gobble());
    }

    @Override
    public void display() {
        System.out.println("I'm a model turkey");
    }

}
