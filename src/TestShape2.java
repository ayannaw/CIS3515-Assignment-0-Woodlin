import java.util.Scanner;

public class TestShape2 {
    public static void main(String[] args) {
        final String QUIT = "Q";
        Shape shape;
        Scanner input = new Scanner(System.in);
        String option = "";
        int shapeCount = 0;
        while(option != "Q" || option != "q") {
            System.out.println("Enter S: Square, C: Circle, T: Triangle, E: Equilateral Triangle, " +
                    "Q: Quit");
            option = input.next();

            if (option.equalsIgnoreCase("S")) {
                shapeCount++;
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

                System.out.println("-----------------------------");
            }
            
        }
        System.out.println("Shapes Created: " + shapeCount);
    }
}
