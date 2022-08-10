package org.dti.bluecross;

public class CeilingFan {
    private int fanSpeed;
    private final String fanType;
    private String rotationDirection;

    public CeilingFan() {
        this.fanType = "Ceiling Fan";
        this.fanSpeed = 0;
        this.rotationDirection = String.valueOf(directions.CLOCKWISE);
    }

    public void changeSpeed() {
        this.fanSpeed = isHighestSpeed() ? 0 : this.fanSpeed + 1;
        System.out.println("Fan speed is now: " + defineSpeed(fanSpeed) + "\n");
    }

    private boolean isHighestSpeed() {
        return fanSpeed == 3;
    }

    private String defineSpeed(int currentSpeed) {

        String speedString = switch (currentSpeed) {
            case 0 -> "off";
            case 1 -> "low";
            case 2 -> "medium";
            case 3 -> "fast";
            default -> "unknown";
        };

        return speedString;
    }


    public void reverseDirection() {
        if (this.rotationDirection.equals(String.valueOf(directions.CLOCKWISE))) {
            this.rotationDirection = String.valueOf(directions.COUNTERCLOCKWISE);
        }
        else {
            this.rotationDirection = String.valueOf(directions.CLOCKWISE);
        }
        System.out.println("Rotation direction is now " + getRotationDirection().toLowerCase() + "\n");
    }

    public String getRotationDirection() {
        return rotationDirection;
    }

    @Override
    public String toString() {
        return "The " +  fanType +
                " is currently set to spin " +
                rotationDirection.toLowerCase() +
                " and the speed is set to " +
                defineSpeed(fanSpeed);
    }

    private enum directions {
        CLOCKWISE,
        COUNTERCLOCKWISE
    }




}
