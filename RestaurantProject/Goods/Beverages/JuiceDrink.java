public class JuiceDrink extends Beverage {

    public JuiceDrink() {
        super.setDescription("JuiceDrinks");
    }

    @Override
    public double cost() {
        return 10.00;
    }

}
