package shape;

public class Calculator {

    private double total;

    public double sumSufaceArea(Shape shape){
        total += shape.surfaceArea();
        return total;
    }
}
