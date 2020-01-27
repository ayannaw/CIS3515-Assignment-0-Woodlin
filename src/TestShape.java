public class TestShape {
    public static void main(String[] args) {
        Square square1 = new Square("square1");
        square1.setDimensions(3.0, 4.0);
        System.out.println(square1.getName() + ": Dimensions: " + square1.printDimensions() + " Area: " + square1.getArea());

        Circle circle1 = new Circle("circle1");
        circle1.setDimensions(3.0);
        System.out.println(circle1.getName() + ": Dimensions: " + circle1.printDimensions() + " Area: " + circle1.getArea());
    }
}
