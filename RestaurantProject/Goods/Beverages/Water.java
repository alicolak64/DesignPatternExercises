public class Water extends Beverage {
    
    public Water() {
        super.setDescription("Water");
    }

    @Override
    public double cost() {
        return 10.00;
    }
    
}
