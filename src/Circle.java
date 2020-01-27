public class Circle extends Shape {
    private double radius;
    public Circle(String name) {
        super(name);
    }

    public void setDimensions(double radius) {
        this.radius = radius;
    }
}
