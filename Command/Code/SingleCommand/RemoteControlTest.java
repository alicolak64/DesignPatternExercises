public class RemoteControlTest {

    public static void main(String[] args) {

        SimpleRemoteControl remote = new SimpleRemoteControl();
        SimpleLight light = new SimpleLight();
        SimpleLightOnCommand lightOn = new SimpleLightOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

    }

}
