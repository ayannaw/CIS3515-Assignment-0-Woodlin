import java.util.Scanner;

public class TestShape {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Square square = new Square("square");
        System.out.print("Enter the length for " + square.getName() + ": ");
        double length = input.nextDouble();
        System.out.print("Enter the width for " + square.getName() + ": ");
        double width = input.nextDouble();
        square.setDimensions(length, width);
        System.out.println(square.getName());
        System.out.println(square.printDimensions());
        System.out.println("Area: " + square.getArea());

        System.out.println("-----------------------------");

        Circle circle = new Circle("circle");
        System.out.print("Enter the radius for " + circle.getName() + ": ");
        double radius = input.nextDouble();
        circle.setDimensions(radius);
        System.out.println(circle.getName());
        System.out.println(circle.printDimensions());
        System.out.println("Area: " + circle.getArea());

        System.out.println("-----------------------------");

        Triangle triangle = new Triangle("triangle");
        System.out.print("Enter side 1: ");
        double a = input.nextDouble();
        System.out.print("Enter side 2: ");
        double b = input.nextDouble();
        System.out.print("Enter side 3: ");
        double c = input.nextDouble();
        triangle.setDimensions(a,b,c);
        System.out.println(triangle.getName());
        System.out.println(triangle.printDimensions());
        System.out.println("Area: " + triangle.getArea());

        System.out.println("-----------------------------");

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle("equilateral triangle");
        System.out.print("Enter side for " + equilateralTriangle.getName());
        double eqSide = input.nextDouble();
        equilateralTriangle.setDimensions(eqSide);
        System.out.println(equilateralTriangle.getName());
        System.out.println(equilateralTriangle.printDimensions());
        System.out.println("Area: " + equilateralTriangle.getArea());
        /*System.out.println(square1.getName() + ": Dimensions: "
                + square1.printDimensions() + " Area: " + square1.getArea());

        Circle circle1 = new Circle("circle");
        circle1.setDimensions(3.0);
        System.out.println(circle1.getName() + ": Dimensions: "
                + circle1.printDimensions() + " Area: " + circle1.getArea());

        Triangle triangle = new Triangle("triangle");
        triangle.setDimensions(4.0, 5.0, 6.0);
        System.out.println(triangle.getName() + ": Dimensions: "
                + triangle.printDimensions() + " Area: " + triangle.getArea());

        EquilateralTriangle eqTriangle = new EquilateralTriangle("equilateral triangle");
        eqTriangle.setDimensions(4.0);
        System.out.println(eqTriangle.getName() + ": Dimensions: "
                + eqTriangle.printDimensions() + " Area: " + eqTriangle.getArea());*/
    }
}
