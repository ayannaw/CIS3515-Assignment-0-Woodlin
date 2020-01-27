public class Square extends Shape {
    private double length;
    private double width;
    public Square(String name) {
        super(name);
    }

    public void setDimensions (double length, double width) {
        this.length = length;
        this.width = width;
    }

}
