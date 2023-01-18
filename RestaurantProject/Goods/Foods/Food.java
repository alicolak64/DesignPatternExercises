public abstract class Food implements Goods {

    private String description = "Unknown Food";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

     public abstract double cost() ;

}
