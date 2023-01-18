public class TomatoSauce extends Condiment {

    private Food food;

    public TomatoSauce(Food food) {
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