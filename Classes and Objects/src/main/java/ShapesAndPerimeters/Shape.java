package ShapesAndPerimeters;

abstract public class Shape {
    abstract double getArea(double width, double length);
    abstract double getPerimeter(double width, double length);
    abstract double getArea(double radius);
    abstract double getPerimeter(double radius);
    abstract double getArea(double base1, double base2, double base3);
    public static String colour;
}
