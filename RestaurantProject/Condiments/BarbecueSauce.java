public class BarbecueSauce extends Condiment {

    private Food food;

    public BarbecueSauce(Food food) {
        this.food = food;
    }

    @Override
    public String getDescription() {
        return food.getDescription() + ", BarbecueSauce";
    }

    @Override
    public double cost() {
        return food.cost() + 5.0;
    }


}
