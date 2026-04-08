package shape;

public class ExShape {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.sumSufaceArea(new Circle(5));
        calculator.sumSufaceArea(new Rectangle(10,5));
        double r = calculator.sumSufaceArea(new Square(7));

        System.out.println(r);
    }
}
