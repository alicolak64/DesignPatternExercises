public class RestaurantCustomer implements Delivery {

    @Override
    public void deliver() {
        System.out.println("Restaurant Customer");
    }

    @Override
    public String getDescription() {
        return "Restaurant Customer";
    }

}
