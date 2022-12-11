package number1;

public class Circle extends Shape
{
    int R;
    Circle(int R)
    {
        this.R=R;
        this.name="Circle";
    }
    double getArea() {return Math.PI*Math.pow(R,2);}
    double getPerimeter() {return Math.PI*2*R;}
}
