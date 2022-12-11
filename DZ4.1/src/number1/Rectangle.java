package number1;

public class Rectangle extends Shape
{
    int a,b;
    Rectangle(int a, int b)
    {
        this.a=a;
        this.b=b;
        this.name="Rectangle";
    }
    int getArea() {return a*b;}
    int getPerimeter() {return 2*(a+b);}
}
