public class Decaf extends Beverage {

    public Decaf() {
        super.setDescription("Decaf Coffee");
    }

    @Override
    public double cost() {
        return 1.05;
    }

}
