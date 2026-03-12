package walk;

public class Ant implements Walkable {

    public int totalDistance = 100;

    @Override
    public void walk() {
        totalDistance -= 10;
    }

    @Override
    public void stop() {
        totalDistance = 100;
    }
}
