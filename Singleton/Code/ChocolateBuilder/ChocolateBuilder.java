public class ChocolateBuilder {

    public static void main(String[] args) {
        Chocolate chocolate = new Chocolate();
        chocolate.addVanilla();
        chocolate.addNuts();
        chocolate.addCaramel();
        chocolate.addCream();
        chocolate.prepare();

        Chocolate chocolate2 = new Chocolate();
        chocolate2.addVanilla();
        chocolate2.addNuts();
        chocolate2.prepare();
    }

}
