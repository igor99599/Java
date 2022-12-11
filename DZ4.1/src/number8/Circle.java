package number8;

public class Circle extends Shape
{
    protected double r;

    Circle()
    {

    }

    Circle(double r)
    {
       this.r=r;
    }

    Circle(double r, String color, boolean filled)
    {
        this.r=r;
        this.color=color;
        this.filled=filled;
    }

    public double getR() {return r;}
    public void setR(double r) {this.r = r;}

    @Override
    double getArea() {
        return Math.PI*Math.pow(r,2);
    }

    @Override
    double getPerimeter() {
        return 2*Math.PI*r;
    }

    public void tString()
    {
        System.out.println("Окружность:");
    }
}
