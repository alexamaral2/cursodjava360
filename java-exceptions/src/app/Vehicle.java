package app;

public class Vehicle {

    private int currentSpeed;

    public Vehicle(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void accelerate() {
        if (this.currentSpeed * 2 > 200) {
            throw new ExcessiveSpeedException("Vehicle is too fast");
        }
        this.currentSpeed *= 2;
    }

    public int getCurrentSpeed() {
        return this.currentSpeed;
    }
}
