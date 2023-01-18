public class GarlicSauce extends Condiment {

    private Food food;

    public GarlicSauce(Food food) {
        this.food = food;
    }

    @Override
    public String getDescription() {
        return food.getDescription() + ", GarlicSauce";
    }

    @Override
    public double cost() {
        return food.cost() + 5.0;
    }

}
