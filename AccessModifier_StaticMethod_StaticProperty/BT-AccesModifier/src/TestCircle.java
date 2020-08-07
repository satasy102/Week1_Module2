public class TestCircle {
    public static void main(String[] args) {
        Circle circle1=new Circle();
        Circle circle2=new Circle(5);

        System.out.println("Radius Circle1: "+circle1.getRadius());

        System.out.println("Radius Circle2: "+circle2.getRadius());

        System.out.println("Area Circle1: "+circle1.getArea());

        System.out.println("Area Circle2: "+circle2.getArea());
    }

}
