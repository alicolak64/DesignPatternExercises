public class Pizza extends Food {

    public Pizza() {
        super.setDescription("Pizza");
    }

    @Override
    public double cost() {
        return 60.00;
    }

}
