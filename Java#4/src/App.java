import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select a shape type:");
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Triangle");
            System.out.println("4. Square");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    processRectangle(scanner);
                    break;
                case 2:
                    processCircle(scanner);
                    break;
                case 3:
                    processTriangle(scanner);
                    break;
                case 4:
                    processSquare(scanner);
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private static void processRectangle(Scanner scanner) {
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        Rectangle rectangle = new Rectangle("Rectangle", length, width);
        displayShapeInfo(rectangle);
    }

    private static void processCircle(Scanner scanner) {
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        Circle circle = new Circle("Circle", radius);
        displayShapeInfo(circle);
    }

    private static void processTriangle(Scanner scanner) {
        System.out.print("Enter the length of side 1 of the triangle: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter the length of side 2 of the triangle: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter the length of side 3 of the triangle: ");
        double side3 = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        Triangle triangle = new Triangle("Triangle", side1, side2, side3);
        displayShapeInfo(triangle);
    }

    private static void processSquare(Scanner scanner) {
        System.out.print("Enter the side length of the square: ");
        double sideLength = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        Square square = new Square("Square", sideLength);
        displayShapeInfo(square);
    }

    private static void displayShapeInfo(Shape shape) {
        System.out.println("Shape: " + shape.getName());
        System.out.println("Area: " + shape.getArea());
        System.out.println("Perimeter: " + shape.getPerimeter());
        System.out.println();
    }
}
