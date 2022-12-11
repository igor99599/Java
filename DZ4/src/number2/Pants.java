package number2;

public class Pants extends Clothes implements MenClothing,WomenClothing
{

    @Override
    public void dressMan() {
        System.out.println("Надели штаны на мужчину");
    }

    @Override
    public void dressWomen() {
        System.out.println("Надели штаны на женщину");
    }

    public Pants(Size size, int price, String color)
    {
        this.size=size;
        this.price=price;
        this.color=color;
    }
}
