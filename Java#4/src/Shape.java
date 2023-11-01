public abstract class Shape {
    // Attribute
    private String name;

    // Constructor
    public Shape(String name) {
        this.name = name;
    }

    // Abstract method to calculate and return the area of the shape
    public abstract double getArea();

    // Abstract method to calculate and return the perimeter of the shape
    public abstract double getPerimeter();

    // Getter for the name attribute
    public String getName() {
        return name;
    }
}
