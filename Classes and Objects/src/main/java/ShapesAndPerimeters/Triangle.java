package ShapesAndPerimeters;

public class Triangle extends Shape{
    @Override
    double getArea(double width, double length) {
        return 0;
    }

    @Override
    double getPerimeter(double width, double length) {
        return (width*length)/2;
    }

    @Override
    double getArea(double radius) {
        return 0;
    }

    @Override
    double getPerimeter(double radius) {
        return 0;
    }

    @Override
    double getArea(double base1, double base2, double base3) {
        return base1 + base2 + base3;
    }
}
