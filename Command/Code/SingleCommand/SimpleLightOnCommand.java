public class SimpleLightOnCommand implements SimpleCommand {
    SimpleLight light;

    public SimpleLightOnCommand(SimpleLight light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

}
