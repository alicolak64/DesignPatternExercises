public class CreditCard implements Payment{
    @Override
    public void pay() {
        System.out.println("Payment1");
    }

    @Override
    public String getDescription() {
        return "Payment with credit card";
    }
}
