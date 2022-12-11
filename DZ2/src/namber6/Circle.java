package namber6;

public class Circle
{
    private int r1;
    private int r2;
    public Circle(int r1,int r2)
    {
        this.r1=r1;
        this.r2=r2;
    }

    public double len(int r)
    {
        double l=2*3.14*r;
        return l;
    }

    public double square(int r)
    {
        double s=3.14*r*r;
        return s;
    }

    public void comparison(int r1, int r2) {
        if (r1 > r2) {System.out.println("r1>r2");}
        else {System.out.println("r1<r2");}
    }
}
