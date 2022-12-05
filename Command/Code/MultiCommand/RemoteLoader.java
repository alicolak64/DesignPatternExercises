public class RemoteLoader {

    
    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan livingRoomCeilingFan = new CeilingFan("Living Room");
        CeilingFan kitchenCeilingFan = new CeilingFan("Kitchen");
        GarageDoor garageDoor = new GarageDoor("Home");
        Stereo livingRoomStereo = new Stereo("Living Room");
        Stereo kitchenStereo = new Stereo("Kitchen");


        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand livingRoomCeilingFanOn = new CeilingFanOnCommand(livingRoomCeilingFan);
        CeilingFanOffCommand livingRoomCeilingFanOff = new CeilingFanOffCommand(livingRoomCeilingFan);

        CeilingFanOnCommand kitchenCeilingFanOn = new CeilingFanOnCommand(kitchenCeilingFan);
        CeilingFanOffCommand kitchenCeilingFanOff = new CeilingFanOffCommand(kitchenCeilingFan);

        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand livingRoomStereoOnWithCD = new StereoOnWithCDCommand(livingRoomStereo);
        StereoOffCommand livingRoomStereoOff = new StereoOffCommand(livingRoomStereo);

        StereoOnWithCDCommand kitchenStereoOnWithCD = new StereoOnWithCDCommand(kitchenStereo);
        StereoOffCommand kitchenStereoOff = new StereoOffCommand(kitchenStereo);


        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, livingRoomCeilingFanOn, livingRoomCeilingFanOff);
        remoteControl.setCommand(3, kitchenCeilingFanOn, kitchenCeilingFanOff);
        remoteControl.setCommand(4, garageDoorUp, garageDoorDown);
        remoteControl.setCommand(5, livingRoomStereoOnWithCD, livingRoomStereoOff);
        remoteControl.setCommand(6, kitchenStereoOnWithCD, kitchenStereoOff);

        System.out.println(remoteControl);

        for (int i = 0; i < 7; i++) {
            remoteControl.onButtonWasPushed(i);
            remoteControl.offButtonWasPushed(i);
        }



    }

}
