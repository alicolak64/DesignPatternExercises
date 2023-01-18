public class Cash implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment2");
    }

    @Override
    public String getDescription() {
        return "Payment with cash";
    }
}
