package number1;

public class Square extends Shape
{
    int a,b;
    Square (int a, int b)
    {
        this.a=a;
        this.b=b;
        this.name="Square";
    }
    int getArea() {return a*b;}
    int getPerimeter() {return 2*(a+b);}
}
