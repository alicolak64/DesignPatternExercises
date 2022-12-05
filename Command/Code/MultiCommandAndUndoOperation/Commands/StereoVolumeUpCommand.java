public class StereoVolumeUpCommand implements Command {
    Stereo stereo;
    int prevVolume;

    public StereoVolumeUpCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        prevVolume = stereo.getVolume();
        stereo.volumeUp();
    }

    @Override
    public void undo() {
        if ( prevVolume > 0)
            stereo.volumeDown();
    }
}
