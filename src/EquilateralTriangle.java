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
        double area = ((Math.sqrt(3))/4) * Math.pow(a,2);
        return area;
    }
}
