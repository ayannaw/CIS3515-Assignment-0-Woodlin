public class Triangle extends Shape {
    private double a, b, c;
    public Triangle(String name) {
        super(name);
    }

    @Override
    public double getArea() {
        double perimeter = a + b + c;
        double s = perimeter / 2.0;
        double area = Math.round(Math.sqrt((s * (s-a) * (s-b) * (s-c))));
        return area;
    }

    public void setDimensions(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public String printDimensions() {
        return "Side 1: " + a + " Side 2: " + b + " Side 3: " + c;
    }
}
