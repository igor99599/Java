package namber2;

public class Ball
{
    private double x=0.0;
    private double y=0.0;
    public Ball(double x, double y)
    {
        this.x=x;
        this.y=y;
    }
    public double getX() {return x;}
    public void setX(double x) {this.x = x;}
    public double getY() {return y;}
    public void setY(double y) {this.y = y;}
    public void setXY(double x, double y) {this.x = x; this.y = y;}
    public void move()
    {
       double xDisp=x+10.0;
       double yDisp=y+10.0;
        System.out.println("new X="+xDisp+" new Y="+yDisp);
    }
    public String toString() {return("X="+x+" Y="+y);}
}
