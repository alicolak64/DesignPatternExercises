public class Cola extends Beverage {

    public Cola() {
        super.setDescription("Cola");
    }

    @Override
    public double cost() {
        return 15.00;
    }

}
