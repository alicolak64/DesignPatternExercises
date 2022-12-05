public class SimpleRemoteControl {
    SimpleCommand slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(SimpleCommand command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
