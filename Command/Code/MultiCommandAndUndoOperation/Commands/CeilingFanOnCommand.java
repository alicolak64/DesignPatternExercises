public class CeilingFanOnCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.on();
    }

    @Override
    public void undo() {
        if (prevSpeed == 0)
            ceilingFan.off();
        else if (prevSpeed == 1)
            ceilingFan.low();
        else if (prevSpeed == 2)
            ceilingFan.medium();
        else if (prevSpeed == 3)
            ceilingFan.high();
    }

}
