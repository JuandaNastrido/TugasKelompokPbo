package tugasGrup.tugas3;
public class Main {
    public static void main(String[] args) {
        GeometricObject circle = new Circle(5.0);
        GeometricObject rectangle = new Rectangle(4.0, 6.0);

        System.out.println(circle.toString());
        System.out.println("Area: " + String.format("%.2f", circle.getArea()));
        System.out.println("Perimeter: " + String.format("%.2f", circle.getPerimeter()));

        System.out.println();

        System.out.println(rectangle.toString());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}
