public class StereoVolumeDownCommand implements Command {

    Stereo stereo;
    int prevVolume;

    public StereoVolumeDownCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        prevVolume = stereo.getVolume();
        stereo.volumeDown();
    }

    @Override
    public void undo() {
        if ( prevVolume < 30)
            stereo.volumeUp();
    }


}
