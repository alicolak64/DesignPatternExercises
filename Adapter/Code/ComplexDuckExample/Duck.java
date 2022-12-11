public abstract class Duck {

    FlyBehaviour flyBehaviour;
    SoundBehaviour soundBehaviour;

    public Duck () {

    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performSound() {
        soundBehaviour.sound();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public abstract void display();

    public void setFlyBehaviour(FlyBehaviour fb) {
        flyBehaviour = fb;
    }

    public void setSoundBehaviour(SoundBehaviour sb) {
        soundBehaviour = sb;
    }

    public void getFlyBehaviour() {
        flyBehaviour.fly();
    }

    public void getSoundBehaviour() {
        soundBehaviour.sound();
    }

}
