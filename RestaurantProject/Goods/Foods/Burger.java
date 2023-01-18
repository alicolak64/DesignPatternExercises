public class Burger extends Food {
    
    public Burger() {
        super.setDescription("Burger");
    }

    @Override
    public double cost() {
        return 40.00;
    }
    
    
}
