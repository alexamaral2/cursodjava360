package app;

public class ExVehicle {

    public static void main(String[] args) {
        Vehicle v = new Vehicle(5);
        v.accelerate();
        System.out.println(v.getCurrentSpeed());

        v.accelerate();
        System.out.println(v.getCurrentSpeed());

        v.accelerate();
        System.out.println(v.getCurrentSpeed());

        v.accelerate();
        System.out.println(v.getCurrentSpeed());

        v.accelerate();
        System.out.println(v.getCurrentSpeed());

        v.accelerate();
        System.out.println(v.getCurrentSpeed());
    }
}
