public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Circle 1 Details:");
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Color: " + circle1.getColor());
        System.out.println("Area: " + circle1.getArea());

        Circle circle2 = new Circle(3.5);
        System.out.println("\nCircle 2 Details:");
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Color: " + circle2.getColor());
        System.out.println("Area: " + circle2.getArea());

        circle2.setRadius(5.0);
        circle2.setColor("blue");
        System.out.println("\nUpdated Circle 2 Details:");
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Color: " + circle2.getColor());
        System.out.println("Area: " + circle2.getArea());
    }
}
