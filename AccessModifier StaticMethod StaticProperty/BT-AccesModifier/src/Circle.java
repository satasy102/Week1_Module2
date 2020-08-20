public class Circle {
    private double radius=1;
    private String color="red";

    Circle(){};
    Circle(double radius){};

     double getRadius() {
        return radius;
    }

     double getArea() {
        double area=radius*radius*Math.PI;
        return area;
    }
}
