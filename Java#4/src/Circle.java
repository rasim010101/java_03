public class Circle extends Shape {
    // Attribute
    private double radius;

    // Constructor
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    // Implementing the getArea() method for circles

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Implementing the getPerimeter() method for circles
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Getter for the radius attribute
    public double getRadius() {
        return radius;
    }
}
