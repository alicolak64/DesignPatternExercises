public class Client {

    public static void main(String[] args) {


        Restaurant restaurant = Restaurant.getInstance();

        Cart cart1 = new Cart();

        Food food1 = new Kebab();
        cart1.addFood(food1);

        Food food2 = new Doner();
        food2 = new DoublePortion(food2);
        cart1.addFood(food2);

        Beverage beverage1 = new TurnipJuice();
        cart1.addFood(beverage1);

        restaurant.addOrder(cart1,new Cash(),new HomeDelivery());

        System.out.println("****** First print ***** \n");
        restaurant.printOrder(1);

        System.out.println("\n****** Order after changing delivery ***** \n");
        restaurant.setDeliveryOrder(1,new RestaurantCustomer());
        restaurant.printOrder(1);

        Food food3 = new Wrap();
        food3 = new ExtraCheese(food3);

        System.out.println("\n****** Order after add wrap food ***** \n");
        cart1.addFood(food3);
        restaurant.printOrder(1);

        System.out.println("\n****** Order after remove wrap food ***** \n");
        cart1.removeFood(food3);
        restaurant.printOrder(1);

        System.out.println("\n****** Order after changing payment ***** \n");
        restaurant.setPaymentOrder(1,new CreditCard());
        restaurant.printOrder(1);

        restaurant.printOrders();

        Cart cart2 = new Cart();

        Food food4 = new FriedPotatoes();
        food4 = new DoublePortion(food4);
        cart2.addFood(food4);

        Food food5 = new MeatBall();
        food5 = new BarbecueSauce(food5);
        cart2.addFood(food5);

        restaurant.addOrder(cart2,new Cash(),new RestaurantCustomer());

        restaurant.printOrders();


    }

}
