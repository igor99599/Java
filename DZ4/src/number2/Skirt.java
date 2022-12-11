package number2;

public class Skirt extends Clothes implements WomenClothing
{

    @Override
    public void dressWomen() {
        System.out.println("Надели юбку на женщину");
    }

    public Skirt(Size size, int price, String color)
    {
        this.size=size;
        this.price=price;
        this.color=color;
    }
}
