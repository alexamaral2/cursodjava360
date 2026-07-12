package enums;

import static enums.Car.Brand.BMW;

public class EnumApp5 {

    public static void main(String[] args) {
        Car c = new Car(BMW);
        System.out.println(c.getBrand());
    }
}
