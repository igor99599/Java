package namber6;

import java.util.Scanner;

public class CircleTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите радиус r1");
        int r1= in.nextInt();
        System.out.println("Введите радиус r2");
        int r2=in.nextInt();
        Circle c=new Circle(r1,r2);
        double l1= c.len(r1);
        System.out.println("Длина окружности с радиусом r1="+l1);
        double l2= c.len(r2);
        System.out.println("Длина окружности с радиусом r2="+l2);
        double s1=c.square(r1);
        System.out.println("Площадь окружности с радиусом r1="+s1);
        double s2=c.square(r2);
        System.out.println("Площадь окружности с радиусом r2="+s2);
        c.comparison(r1,r2);
    }
}
