package interfaces;

public class Circle extends Shape {
    private final double radius;
    final double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return pi * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * pi * radius;
    }

}