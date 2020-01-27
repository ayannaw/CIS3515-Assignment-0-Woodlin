public class TestShape {
    public static void main(String[] args) {
        Square square1 = new Square("circle");
        square1.setDimensions(3.0, 4.0);
        System.out.println(square1.getName() + ": Dimensions: "
                + square1.printDimensions() + " Area: " + square1.getArea());

        Circle circle1 = new Circle("circle");
        circle1.setDimensions(3.0);
        System.out.println(circle1.getName() + ": Dimensions: "
                + circle1.printDimensions() + " Area: " + circle1.getArea());

        Triangle triangle = new Triangle("triangle");
        triangle.setDimensions(4.0, 5.0, 6.0);
        System.out.println(triangle.getName() + ": Dimensions: "
                + triangle.printDimensions() + " Area: " + triangle.getArea());
    }
}
