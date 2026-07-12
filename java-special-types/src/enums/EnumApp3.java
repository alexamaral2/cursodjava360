package enums;

public class EnumApp3 {
    public static void main(String[] args) {
        Dog d = new Dog();
        talk(MyPet.CAT);
        talk(MyPet.MOUSE);
    }

    private static void talk(Pet pet){
        System.out.println(pet.talk());
    }
}
