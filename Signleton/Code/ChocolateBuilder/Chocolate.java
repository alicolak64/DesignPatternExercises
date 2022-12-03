public class Chocolate {

    private boolean hasVanilla;
    private boolean hasNuts;
    private boolean hasCaramel;
    private boolean hasCream;

    private String description = "Chocolate with";


    public Chocolate() {

    }

    public void prepare() {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();
        getDescription();
        System.out.println("Prepared boiler " + boiler.hashCode() );
    }

    public void addVanilla() {
        hasVanilla = true;
        description += ", Vanilla";
    }

    public void addNuts() {
        hasNuts = true;
        description += ", Nuts";
    }

    public void addCaramel() {
        hasCaramel = true;
        description += ", Caramel";
    }

    public void addCream() {
        hasCream = true;
        description += ", Cream";
    }

    public void getDescription () {
        System.out.println(description);
    }

}
