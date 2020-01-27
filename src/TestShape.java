public class TestShape {
    public static void main(String[] args) {
        Square square1 = new Square("square1");
        square1.setDimensions(3.0, 4.0);
        System.out.println(square1.getName() + ": Dimensions: " + square1.printDimensions() + " Area: " + square1.getArea());


    }
}
