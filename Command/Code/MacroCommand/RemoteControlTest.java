public class RemoteControlTest {

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

        StereoVolumeUpCommand livingRoomStereoVolumeUpCommand = new StereoVolumeUpCommand(livingRoomStereo);
        StereoVolumeDownCommand livingRoomStereoVolumeDownCommand = new StereoVolumeDownCommand(livingRoomStereo);

        StereoVolumeUpCommand kitchenStereoVolumeUpCommand = new StereoVolumeUpCommand(kitchenStereo);
        StereoVolumeDownCommand kitchenStereoVolumeDownCommand = new StereoVolumeDownCommand(kitchenStereo);

        Command[] partyOn = {livingRoomLightOn, kitchenLightOn, livingRoomCeilingFanOn, kitchenCeilingFanOn, garageDoorUp, livingRoomStereoOnWithCD, kitchenStereoOnWithCD};
        Command[] partyOff = {livingRoomLightOff, kitchenLightOff, livingRoomCeilingFanOff, kitchenCeilingFanOff, garageDoorDown, livingRoomStereoOff, kitchenStereoOff};


        Command[] livingRoomOn = {livingRoomLightOn, livingRoomCeilingFanOn, livingRoomStereoOnWithCD};
        Command[] livingRoomOff = {livingRoomLightOff, livingRoomCeilingFanOff, livingRoomStereoOff};

        Command[] kitchenOn = {kitchenLightOn, kitchenCeilingFanOn, kitchenStereoOnWithCD};
        Command[] kitchenOff = {kitchenLightOff, kitchenCeilingFanOff, kitchenStereoOff};

        Command[] lightOn = {livingRoomLightOn, kitchenLightOn};
        Command[] lightOff = {livingRoomLightOff, kitchenLightOff};

        Command[] ceilingFanOn = {livingRoomCeilingFanOn, kitchenCeilingFanOn};
        Command[] ceilingFanOff = {livingRoomCeilingFanOff, kitchenCeilingFanOff};

        Command[] stereoOn = {livingRoomStereoOnWithCD, kitchenStereoOnWithCD};
        Command[] stereoOff = {livingRoomStereoOff, kitchenStereoOff};

        Command[] stereoVolumeUp = {livingRoomStereoVolumeUpCommand, kitchenStereoVolumeUpCommand};
        Command[] stereoVolumeDown = {livingRoomStereoVolumeDownCommand, kitchenStereoVolumeDownCommand};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);
        MacroCommand livingRoomOnMacro = new MacroCommand(livingRoomOn);
        MacroCommand livingRoomOffMacro = new MacroCommand(livingRoomOff);
        MacroCommand kitchenOnMacro = new MacroCommand(kitchenOn);
        MacroCommand kitchenOffMacro = new MacroCommand(kitchenOff);
        MacroCommand lightOnMacro = new MacroCommand(lightOn);
        MacroCommand lightOffMacro = new MacroCommand(lightOff);
        MacroCommand ceilingFanOnMacro = new MacroCommand(ceilingFanOn);
        MacroCommand ceilingFanOffMacro = new MacroCommand(ceilingFanOff);
        MacroCommand stereoOnMacro = new MacroCommand(stereoOn);
        MacroCommand stereoOffMacro = new MacroCommand(stereoOff);
        MacroCommand stereoVolumeUpMacro = new MacroCommand(stereoVolumeUp);
        MacroCommand stereoVolumeDownMacro = new MacroCommand(stereoVolumeDown);



        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, livingRoomCeilingFanOn, livingRoomCeilingFanOff);
        remoteControl.setCommand(3, kitchenCeilingFanOn, kitchenCeilingFanOff);
        remoteControl.setCommand(4, garageDoorUp, garageDoorDown);
        remoteControl.setCommand(5, livingRoomStereoOnWithCD, livingRoomStereoOff);
        remoteControl.setCommand(6, kitchenStereoOnWithCD, kitchenStereoOff);
        remoteControl.setCommand(7,livingRoomStereoVolumeUpCommand,livingRoomStereoVolumeDownCommand);
        remoteControl.setCommand(8,kitchenStereoVolumeUpCommand,kitchenStereoVolumeDownCommand);
        remoteControl.setCommand(9, partyOnMacro, partyOffMacro);
        remoteControl.setCommand(10, livingRoomOnMacro, livingRoomOffMacro);
        remoteControl.setCommand(11, kitchenOnMacro, kitchenOffMacro);
        remoteControl.setCommand(12, lightOnMacro, lightOffMacro);
        remoteControl.setCommand(13, ceilingFanOnMacro, ceilingFanOffMacro);
        remoteControl.setCommand(14, stereoOnMacro, stereoOffMacro);
        remoteControl.setCommand(15, stereoVolumeUpMacro, stereoVolumeDownMacro);


        System.out.println(remoteControl);

        for (int i = 0; i < remoteControl.getCountCommands(); i++) {
            remoteControl.onButtonWasPushed(i);
            remoteControl.offButtonWasPushed(i);
        }




    }

}
