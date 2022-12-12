public class Coffee extends CaffeineBeverage {

    @Override
    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    public void brewCoffeeGrinds() {
        System.out.println("Dripping Coffee through filter");
    }

    public void addSugarAndMilk() {
        System.out.println("Adding Sugar and Milk");
    }


}
