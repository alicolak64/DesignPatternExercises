public class DuckAdapter implements Turkey {
    
    Duck duck;
    
    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }
    
    public void gobble() {
        duck.quack();
    }
    
    public void fly() {
        if (Math.random() < 0.5) {
            duck.fly();
        }
    }
    
}
