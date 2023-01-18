public class Kebab extends Food {

    public Kebab() {
        super.setDescription("Kebab");
    }

    @Override
    public double cost() {
        return 50.00;
    }

}
