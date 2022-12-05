public class StereoVolumeDownCommand implements Command {

    Stereo stereo;

    public StereoVolumeDownCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.volumeDown();
    }


}
