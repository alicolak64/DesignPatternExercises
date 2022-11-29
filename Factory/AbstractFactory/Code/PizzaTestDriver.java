public class PizzaTestDriver {

    public static void main(String[] args) {

        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + " pizza");
        System.out.println(pizza);

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + " pizza");
        System.out.println(pizza);

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ali ordered a " + pizza.getName() + " pizza");
        System.out.println(pizza);

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("John ordered a " + pizza.getName() + " pizza");
        System.out.println(pizza);


    }

}
