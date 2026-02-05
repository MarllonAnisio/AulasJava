package coringas.entities;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public Double area() {
        double areaValue = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + areaValue);
        return areaValue;
    }
}
