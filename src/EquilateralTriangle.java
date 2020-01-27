public class EquilateralTriangle extends Triangle {
    private double a;
    public EquilateralTriangle(String name) {
        super(name);
    }

    public void setDimensions(double a) {
        this.a = a;
    }

    @Override
    public String printDimensions() {
        return "Side: " + a;
    }

    @Override
    public double getArea() {
        double perimeter = 3 * a;
        double s = perimeter / 2.0;
        double area = Math.round(Math.sqrt((s * (s-a) * (s-a) * (s-a))));
        return area;
    }
}
