public class Stereo {

    String location = "";
    int volume = 0;

    public Stereo(String location) {
        this.location = location;
    }

    public int getVolume () {
        return volume;
    }

    public void on() {
        System.out.println( location + " stereo is on");
    }

    public void off() {
        System.out.println( location + " stereo is off");
    }

    public void setCD() {
        System.out.println( location + " stereo is set for CD input");
    }

    public void setDVD() {
        System.out.println( location + " stereo is set for DVD input");
    }

    public void setRadio() {
        System.out.println( location + " stereo is set for Radio");
    }

    public void setVolume(int volume) {
        if (volume <= 30 && volume >= 0) {
            this.volume = volume;
            System.out.println( location + " stereo volume set to " + volume);
        }
    }

    public void volumeUp() {
        if (volume < 30) {
            volume++;
            System.out.println( location + " stereo volume up to " + volume);
        } else
            System.out.println( location + " stereo volume maximum level");

    }

    public void volumeDown() {
        if (volume > 0) {
            volume--;
            System.out.println( location + " stereo volume down to " + volume);
        } else
            System.out.println( location + " stereo volume minimum level");
    }

}
