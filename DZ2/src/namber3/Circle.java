package namber3;

public class Circle {
    private double x;
    private double y;
    private double r;
    private double f;
    public Circle( double x, double y ,double r, double f)
    {
        this.x=x;
        this.y=y;
        this.r=r;
        this.f=f;
    }
    public String toString()
    {
        return("x="+x+" y="+y+" r="+r+" f="+f);
    }
}
