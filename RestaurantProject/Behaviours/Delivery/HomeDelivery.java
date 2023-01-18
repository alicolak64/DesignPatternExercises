public class HomeDelivery implements Delivery {

    @Override
    public void deliver() {
        System.out.println("Home delivery");
    }

    @Override
    public String getDescription() {
        return "Home delivery";
    }
}
