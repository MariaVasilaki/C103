package ShapesAndPerimeters;

public class Rectangle extends Shape{
    @Override
    double getArea(double width,double length) {
        return width * length ;
    }

    @Override
    double getPerimeter(double width, double length) {
        return 2*(width + length);
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
        return 0;
    }
}
