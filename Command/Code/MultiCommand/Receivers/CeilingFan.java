public class CeilingFan {
    String location = "";
    int speed;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void high() {
        speed = 3;
        System.out.println(location + " ceiling fan is on high");
    }

    public void medium() {
        speed = 2;
        System.out.println(location + " ceiling fan is on medium");
    }

    public void low() {
        speed = 1;
        System.out.println(location + " ceiling fan is on low");
    }

    public void off() {
        speed = 0;
        System.out.println(location + " ceiling fan is off");
    }

    public int getSpeed() {
        return speed;
    }

}
