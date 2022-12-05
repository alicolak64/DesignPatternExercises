public class StereoVolumeUpCommand implements Command {
    Stereo stereo;

    public StereoVolumeUpCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.volumeUp();
    }
}
