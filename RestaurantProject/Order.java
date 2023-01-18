import java.util.ArrayList;
import java.util.List;

public class Order {

    private final String orderNo;
    private Payment payment;
    private Delivery delivery;
    private final Cart cart;

    public Order(String orderNo,Cart cart) {
        this.orderNo = orderNo;
        this.cart = cart;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public void printOrder() {
        System.out.println("Order No: " + orderNo);
        System.out.println("Payment: " + payment.getDescription());
        System.out.println("Delivery: " + delivery.getDescription());
        double totalCost = 0;
        for (Goods goods : cart.getCart()) {
            System.out.println(goods.getDescription() + " " + goods.cost());
            totalCost += goods.cost();
        }
        System.out.println("Total Cost: " + totalCost);
        System.out.println("Goods: ");
        for (Goods goods : cart.getCart()) {
            System.out.println(goods.getDescription());
        }
    }

}
