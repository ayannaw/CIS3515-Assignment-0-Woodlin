import java.util.Scanner;

public class TestShape2 {
    public static void main(String[] args) {
        final String QUIT = "Q";
        Shape shape;
        Scanner input = new Scanner(System.in);
        String option = "";
        int shapeCount = 0;
        while(option != "Q") {
            System.out.println("Enter S: Square, C: Circle, T: Triangle, E: Equilateral Triangle, " +
                    "Q: Quit");
            option = input.next();

            if (option.equalsIgnoreCase("Q")) {
                break;
            }
            else if (option.equalsIgnoreCase("S")) {
                shapeCount++;
                CreateSquare();
                System.out.println("-----------------------------");
            }
            else if (option.equalsIgnoreCase("C")) {
                shapeCount++;
                CreateCircle();
                System.out.println("-----------------------------");
            }
            else if (option.equalsIgnoreCase("T")) {
                shapeCount++;
                CreateTriangle();
                System.out.println("-----------------------------");
            }
            else if (option.equalsIgnoreCase("E")) {
                shapeCount++;
                CreateEquilateralTriangle();
                System.out.println("-----------------------------");
            }
            else {
                System.out.println("Not an Option...");
//                System.out.println("Enter S: Square, C: Circle, T: Triangle, E: Equilateral Triangle, " +
//                        "Q: Quit");
            }

        }
        System.out.println("Shapes Created: " + shapeCount);
    }

    public static void CreateCircle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name for the Circle: ");
        String circleName = input.next();
        Circle circle = new Circle(circleName);
        System.out.print("Enter the radius for " + circle.getName() + ": ");
        double radius = input.nextDouble();
        circle.setDimensions(radius);
        System.out.println(circle.getName());
        System.out.println(circle.printDimensions());
        System.out.println("Area: " + circle.getArea());
    }

    public static void CreateEquilateralTriangle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name for the Equilateral Triangle: ");
        String eqTriangleName = input.next();
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(eqTriangleName);
        System.out.print("Enter side for " + equilateralTriangle.getName() + ": ");
        double eqSide = input.nextDouble();
        equilateralTriangle.setDimensions(eqSide);
        System.out.println(equilateralTriangle.getName());
        System.out.println(equilateralTriangle.printDimensions());
        System.out.println("Area: " + equilateralTriangle.getArea());
    }
    public static void CreateTriangle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name for the Triangle: ");
        String triangleName = input.next();
        Triangle triangle = new Triangle(triangleName);
        System.out.print("Enter side 1 for " + triangle.getName() + ": ");
        double a = input.nextDouble();
        System.out.print("Enter side 2 for " + triangle.getName() + ": ");
        double b = input.nextDouble();
        System.out.print("Enter side 3 for " + triangle.getName() + ": ");
        double c = input.nextDouble();
        triangle.setDimensions(a,b,c);
        System.out.println(triangle.getName());
        System.out.println(triangle.printDimensions());
        System.out.println("Area: " + triangle.getArea());
    }
    public static void CreateSquare() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name for the Square: ");
        String squareName = input.next();
        Square square = new Square(squareName);
        System.out.print("Enter the length for " + square.getName() + ": ");
        double length = input.nextDouble();
        System.out.print("Enter the width for " + square.getName() + ": ");
        double width = input.nextDouble();
        square.setDimensions(length, width);
        System.out.println(square.getName());
        System.out.println(square.printDimensions());
        System.out.println("Area: " + square.getArea());

    }



}

