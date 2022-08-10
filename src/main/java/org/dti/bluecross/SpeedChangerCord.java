package org.dti.bluecross;


public class SpeedChangerCord extends Cord{

    private final CeilingFan fan;

    public SpeedChangerCord(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void pull() {
        System.out.println("Pulling the cord to change to the fan speed...");
        fan.changeSpeed();
    }
}
