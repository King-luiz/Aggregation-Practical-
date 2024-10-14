public class Circle {
    // Attribute
    private double radius;
    private String color;

    // Constructor
    public Circle(double radius,String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }
    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
