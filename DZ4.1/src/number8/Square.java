package number8;

public class Square extends Rectangle
{

    Square ()
    {

    }

    Square (double side)
    {
        this.length=side;
        this.width=side;
    }

    Square(double side, String color, boolean filled)
    {
        this.length=side;
        this.color=color;
        this.filled=filled;
    }

    public double getSide(double side) {return side;}
    public void setSide(double side) {this.length = side;}

    public void setWidth(double side) {this.width = side;}
    public void setLength(double side) {this.length = side;}

    public void tString() {System.out.println("Квадрат:");}
}
