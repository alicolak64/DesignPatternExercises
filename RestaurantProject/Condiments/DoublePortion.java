public class DoublePortion extends Condiment {

    private Food food;

    public DoublePortion(Food food) {
        this.food = food;
    }

    @Override
    public String getDescription() {
        return food.getDescription() + ", DoublePortion";
    }

    @Override
    public double cost() {
        return food.cost() * 1.5;
    }

}


