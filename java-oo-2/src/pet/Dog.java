package pet;

public class Dog extends EarthPet{

    @Override
    public void talk() {
        System.out.println("Auauaua");
    }

    @Override
    public void sleep(int time) {
        System.out.println("Dog sleeping");
    }
}
