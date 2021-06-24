package ShapesAndPerimeters;

public class Circle extends Shape{
    @Override
    double getArea(double width, double length) {
        return 0;
    }

    @Override
    double getPerimeter(double width, double length) {
        return 0;
    }

    @Override
    double getArea(double radius) {
        return Math.PI * radius*radius;
    }

    @Override
    double getPerimeter(double radius) {
        return 2*Math.PI*radius;
    }

    @Override
    double getArea(double base1, double base2, double base3) {
        return 0;
    }
}
