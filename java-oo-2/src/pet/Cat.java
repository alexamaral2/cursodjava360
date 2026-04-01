package pet;

public class Cat extends EarthPet{

    @Override
    public void talk() {
        System.out.println("Miaumiau");
    }

    @Override
    public void sleep(int time) {
        System.out.println("Cat sleeping");
    }
}
