package number1;

public class Main
{
    public static void main(String[] args)
    {
        Square s = new Square(2,2);
        System.out.println(s.getType());
        System.out.println(s.getArea());
        System.out.println(s.getPerimeter());

        Circle c = new Circle(3);
        System.out.println(c.getType());
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());

        Rectangle r = new Rectangle(2,3);
        System.out.println(r.getType());
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
    }
}
