package coringas.entities;

public class Rectangle implements Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public Double area() {
        double areaValue = width * height;
        System.out.println("Area of the rectangle: " + areaValue);
        return areaValue;
    }

}
