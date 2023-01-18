public class Milk extends Beverage {
    
    public Milk() {
        super.setDescription("Milk");
    }

    @Override
    public double cost() {
        return 10.00;
    }
    
    
}
