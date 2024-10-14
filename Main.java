public class Main {
    public static void main(String[] args) {
        // an example of Circle with radius 1.0 and color "red"
        Circle circle = new Circle(21.0, "red");

        System.out.println(" Radius: " + circle.getRadius());
        System.out.println("Color: " + circle.getColor());
        System.out.printf("Area: %.2f%n", circle.getArea());
    }
}
