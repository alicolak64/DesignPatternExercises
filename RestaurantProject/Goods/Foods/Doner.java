

public class Doner extends Food {

    public Doner() {
        super.setDescription("Doner");
    }

    @Override
    public double cost() {
        return 40.00;
    }

}
