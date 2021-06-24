package ShapesAndPerimeters;

public class Square extends Shape{

    @Override
    public double getArea(double width,double length){
        return width *width;
    }

    @Override
    public double getPerimeter(double width, double length) {
        return 4*width;
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
