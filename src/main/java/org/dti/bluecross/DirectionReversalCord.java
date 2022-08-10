package org.dti.bluecross;

public class DirectionReversalCord extends Cord{

    private final CeilingFan fan;

    public DirectionReversalCord(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    void pull() {
        System.out.println("Pulling the cord to change to the rotation direction...");
        fan.reverseDirection();
    }
}
