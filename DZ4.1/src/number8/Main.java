package number8;

public class Main
{
    public static void main(String[] args) {
        Square square = new Square(5);
        square.tString();
        System.out.println("Площадь: "+square.getArea());
        System.out.println("Периметр: "+square.getPerimeter());

        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.tString();
        System.out.println("Площадь: "+rectangle.getArea());
        System.out.println("Периметр: "+rectangle.getPerimeter());

        Circle circle = new Circle(7);
        circle.tString();
        System.out.println("Площадь: "+circle.getArea());
        System.out.println("Периметр: "+circle.getPerimeter());
    }
}
