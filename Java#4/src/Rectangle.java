public class Rectangle extends Shape {
    // Attributes
    private double width;
    private double height;

    // Constructor
    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    // Implementing the getArea() method for rectangles
    @Override
    public double getArea() {
        return width * height;
    }

    // Implementing the getPerimeter() method for rectangles
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Getter for the width attribute
    public double getWidth() {
        return width;
    }

    // Getter for the height attribute
    public double getHeight() {
        return height;
    }
}
