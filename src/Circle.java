import java.text.DecimalFormat;

public class Circle extends Shape {
    private double radius;
    public Circle(String name) {
        super(name);
    }

    public void setDimensions(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = 3.14159 * Math.pow(radius, 2);
        return area;
    }

    @Override
    public String printDimensions() {
        return "Radius: " + radius;
    }


}
