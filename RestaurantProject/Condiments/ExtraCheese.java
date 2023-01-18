
public class ExtraCheese extends Condiment {

    private Food food;

    public ExtraCheese(Food food) {
        this.food = food;
    }

    @Override
    public String getDescription() {
        return food.getDescription() + ", ExtraCheese";
    }

    @Override
    public double cost() {
        return food.cost() + 12.0;
    }
}
