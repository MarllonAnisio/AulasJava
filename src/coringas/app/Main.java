package coringas.app;

import coringas.entities.Circle;
import coringas.entities.Rectangle;
import coringas.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Circle(5));
        myShapes.add(new Rectangle(4.0, 6.0));
        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(3.0));
        myCircles.add(new Circle(4.0));
        List<Rectangle> myRectangles = new ArrayList<>();
        myRectangles.add(new Rectangle(2.0, 5.0));
        myRectangles.add(new Rectangle(3.0, 7.0));

        System.out.println("area total : "+ totalArea(myShapes));
        System.out.println("area total circles : "+ totalArea(myCircles));
        System.out.println("area total rectangles : "+ totalArea(myRectangles));

    }
    public static double totalArea(List<? extends Shape> myShapes) {
        double sum = 0.0;
        for (Shape s : myShapes) {
            sum += s.area();

        }
        return sum;
    }
}
