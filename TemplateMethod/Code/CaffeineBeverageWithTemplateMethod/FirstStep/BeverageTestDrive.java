public class BeverageTestDrive {

    public static void main(String[] args) {


        Coffee coffee = new Coffee();

        Tea tea = new Tea();

        System.out.println("Making coffee...");
        coffee.prepareRecipe();

        System.out.println("Making tea...");
        tea.prepareRecipe();



    }

}
