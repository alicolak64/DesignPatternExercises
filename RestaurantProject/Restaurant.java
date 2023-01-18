import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    public volatile static Restaurant instance;
    private final List<Order> orders;

    private int orderCount;

    private Restaurant() {
        orders = new ArrayList<>();
        orderCount = 0;
    }

    public static Restaurant getInstance() {

        if (instance == null) {

            synchronized (Restaurant.class) {

                if (instance == null)
                    instance = new Restaurant();

            }

        }

        return instance;


    }

    public void addOrder (Cart cart, Payment payment, Delivery delivery) {
        orderCount++;
        Order order = new Order(String.valueOf(orderCount),cart);
        order.setPayment(payment);
        order.setDelivery(delivery);
        orders.add(order);
    }

    public void removeOrder (int orderNo) {

        orderNo--;

        for ( Order order : orders )
            if (String.valueOf(orderNo).equals(order.getOrderNo()))
                orders.remove(order);

    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setPaymentOrder (int orderNo, Payment payment) {

        for ( Order order : orders )
            if (String.valueOf(orderNo).equals(order.getOrderNo()))
                order.setPayment(payment);

    }

    public void setDeliveryOrder (int orderNo, Delivery delivery) {

        for ( Order order : orders )
            if (String.valueOf(orderNo).equals(order.getOrderNo()))
                order.setDelivery(delivery);

    }

    public void printOrder(int orderNo) {

        for ( Order order : orders )
            if (String.valueOf(orderNo).equals(order.getOrderNo()))
                order.printOrder();

    }

    public void printOrders() {

        System.out.println("\n ***********  Orders   ************* \n");

        System.out.println("Total order : " + orderCount);

        for ( Order order : orders ) {
            System.out.println("\n ************** Order " + order.getOrderNo() + "    *********** \n");
            order.printOrder();
        }

    }


}
